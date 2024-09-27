import java.util.*;
class account
{
    long acc_no;
    String name;
    float balance;
    String acc_type;

    void getdata(long n , String names , float bal , String actype)
    {
        this.acc_no = n;
        this.name = names;
        this.balance = bal;
        this.acc_type = actype;
    }
    void display()
    {
          System.out.println("Account No = "+acc_no);
          System.out.println("Account Holder = "+name);
          System.out.println("Balance = "+balance);
          System.out.println("Account Type = "+acc_type);
    }
    void withdrawl(float amount)
    {
           balance = balance - amount;
           System.out.println("Remaining Balance = "+balance);
    }
    void deposit(float amount)
    { 
          balance = balance + amount;
          System.out.println("Balance = "+balance);
    }
};
public class accc
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    account acc = new account();
    acc.getdata(1232345,"khush",56000,"Saving");
    acc.display();
    int choose;
    System.out.println("Choose 1 To Withdrawl otherwise to deposit");
    choose = sc.nextInt();
    if(choose == 1)
    acc.withdrawl(20000);
    else
    acc.deposit(100000);

}
}