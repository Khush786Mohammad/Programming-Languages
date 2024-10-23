import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Engine{
    private int engineId;
    private String engineName;
    private String engineType;
    private double enginePrice;

    public Engine(int engineId, String engineName, String engineType, double enginePrice){
        this.engineId = engineId;
        this.engineName = engineName;
        this.engineType = engineType;
        this.enginePrice = enginePrice;
    }
    public int getEngineId(){
        return this.engineId;
    }
    public String getEngineName(){
        return this.engineName;
    }
    public String getEngineType(){
        return this.engineType;
    }
    public double getEnginePrice(){
        return this.enginePrice;
    }
}

public class Solution4{
    public static void main(String[] args){
        Comparator<Engine> custome = Comparator.comparingInt(Engine::getEngineId);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<Engine> engines = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            engines.add(new Engine(id, name, type, price));
        }
        String givenType = sc.nextLine();
        String engineName = sc.nextLine();

        int avgPrice = findAvgEnginePriceByType(engines, givenType);
        List<Engine> ans = searchEngineByName(engines, engineName);
        Collections.sort(ans,custome);

        if(avgPrice != 0){
            System.out.println(avgPrice);
        }
        else{
            System.out.println("There are no engine with given type");
        }

        if(ans.isEmpty()){
            System.out.println("There are no engine with the given name");
        }
        else{
            for(Engine eng: ans){
                System.out.println(eng.getEngineId());
            }
        }

    }

    public static int findAvgEnginePriceByType(List<Engine> engines, String givenType){
        double sum = 0;
        int cnt = 0;

        for(Engine eng: engines){
            if(eng.getEngineType().compareToIgnoreCase(givenType) == 0){
                sum+=eng.getEnginePrice();
                cnt++;
            }
        }
        return (int)sum/cnt;
    }

    public static List<Engine> searchEngineByName(List<Engine> engines, String searchName){
        List<Engine> ans = new ArrayList<>();
        for(Engine eng: engines){
            if(eng.getEngineName().compareToIgnoreCase(searchName) == 0){
                ans.add(eng);
            }
        }
        return ans;
    }
}