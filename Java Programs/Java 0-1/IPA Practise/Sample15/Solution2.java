import java.util.Scanner;
import java.util.regex.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Sim2{
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim2(int id, String company, int balance, double rate, String circle){
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = rate;
        this.circle = circle;
    }

    public int getId(){
        return this.id;
    }
    public String getCompany(){
        return this.company;
    }
    public int getBalance(){
        return this.balance;
    }
    public double getRate(){
        return this.ratePerSecond;
    }
    public String getCircle(){
        return this.circle;
    }
}

class SortByBalance implements Comparator<Sim2>{
    @Override
    public int compare(Sim2 obj1, Sim2 obj2){
        return Integer.compare(obj2.getBalance(), obj1.getBalance());
    }
}

public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Comparator<Sim2> custome = Comparator.comparingInt(Sim2::getBalance).reversed();

        List<Sim2> list = new ArrayList<>();

        for(int i = 0 ;i<4 ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String company = sc.nextLine();
            int balance = sc.nextInt();
            sc.nextLine();
            double rate = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();

            list.add(new Sim2(id, company, balance, rate, circle));
        }

        String searchCircle = sc.nextLine();
        double searchRate = sc.nextDouble();
        Sim2[] ans = matchAndSort(list,searchCircle, searchRate);

        if(ans.length != 0){
            Arrays.sort(ans, custome);
            for(Sim2 vals: ans){
                System.out.println(vals.getId());
            }
        }
        else{
            System.out.println("No results found");
        }
    }

    public static Sim2[] matchAndSort(List<Sim2> list, String searchCircle, double searchRate){
        Sim2[] ans = new Sim2[0];
        for(Sim2 vals : list){
            if(vals.getCircle().equalsIgnoreCase(searchCircle) && searchRate > vals.getRate()){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = vals;
            }
        }
        return ans;
    }
}
