import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Sim{
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle){
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public void setNewCircle(String circle){
        this.circle = circle;
    }
    //getters
    public int getSimId(){
        return this.simId;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getRatePerSecond(){
        return this.ratePerSecond;
    }
    public String getCircle(){
        return this.circle;
    }
}

class SortByRate implements Comparator<Sim>{
    @Override
    public int compare(Sim obj1, Sim obj2){
        return Double.compare(obj2.getRatePerSecond(), obj1.getRatePerSecond());
    }
}

public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Sim[] sims = new Sim[n];

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double bal = sc.nextDouble();
            sc.nextLine();
            double rate = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();

            sims[i] = new Sim(id, name, bal, rate, circle);
        }

        String oldCircle = sc.nextLine();
        String newCircle = sc.nextLine();

        List<Sim> list = transferCustomerCircle(sims, oldCircle, newCircle);

        Collections.sort(list, new SortByRate());

        if(!list.isEmpty()){
            for(Sim sm: list){
                System.out.println(sm.getSimId()+" "+sm.getCustomerName()+" "+sm.getCircle()+" "+sm.getRatePerSecond());
            }
        }
        else{
            System.out.println("No circle found");
        }
    }

    public static List<Sim> transferCustomerCircle(Sim[] sims, String oldCircle, String newCircle){
        List<Sim> list = new ArrayList<Sim>();

        for(Sim sm: sims){
            if(sm.getCircle().compareToIgnoreCase(oldCircle) == 0){
                sm.setNewCircle(newCircle);
                list.add(sm);
            }
        }
        return list;
    }
}