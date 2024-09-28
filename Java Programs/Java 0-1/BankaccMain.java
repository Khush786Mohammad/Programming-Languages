public class BankaccMain{
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount(200297,45000);

        myAcc.withdraw(10000);
        myAcc.withdraw(60000);

        myAcc.deposit(20000);
        myAcc.deposit(-20000);
    }
}
