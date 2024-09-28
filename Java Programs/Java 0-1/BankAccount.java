public class BankAccount {
    private int account_number;
    private int account_balance;

    public BankAccount(int account_number, int account_balance){
        this.account_number = account_number;
        this.account_balance = account_balance;

        System.out.println("Your bank Account number is : " + this.account_number + " and Your account balance is : " + this.account_balance);
    }

    public void withdraw(int amount){
        if(amount < 0)
        {
            System.out.println("You can't withdraw a negative amount");
        }
        else if(amount > this.account_balance){
            System.out.println("Insufficient Balance!");
        }
        else{
            this.account_balance -= amount;
            System.out.println("Current Balance is : " + this.account_balance);
        }
    }

    public void deposit(int amount){
        if(amount <= 0){
            System.out.println("Invalid");
            return;
        }
        this.account_balance += amount;
        System.out.println("Your current balance is : " + this.account_balance);
    }
}
