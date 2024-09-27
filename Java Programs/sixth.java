//Calculate Simple interest and amount using constructor overloading.
class amount
{
    int p_amount;
    double rate;
    int time;

    amount()
    {
        p_amount = 10000;
        rate = 9;
        time = 5;

    }
    amount(int am , double rate , int time )
    {
        this.p_amount = am;
        this.rate = rate;
        this.time = time;
    }
    double cal()
    {
        return (p_amount * rate * time)/100;
    }
};

public class sixth
{
    public static void main(String[] args)
    {
        amount a = new amount();
        amount a2 = new amount(200000 , 10 , 5);
        double final_amount = a.p_amount + a.cal();
        System.out.println("SI="+a.cal()+"Amount = "+final_amount);
        final_amount = a2.p_amount + a2.cal();
        System.out.println("SI = "+a2.cal()+"Amount = "+final_amount);
    }
}