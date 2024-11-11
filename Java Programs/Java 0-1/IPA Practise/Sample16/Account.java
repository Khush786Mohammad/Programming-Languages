import java.util.Scanner;

public class Account {
    private int id;
    private double interestRate;
    private double balance;

    public Account(int id, double interestRate, double balance){
        this.id = id;
        this.interestRate = interestRate;
        this.balance = balance;
    }
    public int getId(){
        return this.id;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public double getBalance(){
        return this.balance;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();

        Account obj1 = new Account(1,5,11000);

        double percentage = obj1.getInterestRate()*100/years;
        double totalInterest = percentage + obj1.getInterestRate();
        System.out.println(totalInterest);
    }
}
