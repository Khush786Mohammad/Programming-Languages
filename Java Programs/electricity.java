import java.util.*;

public class electricity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int unit;
        System.out.println("Enter the unit");

        unit = sc.nextInt();

        double bill = 0.0;
        if(unit<100)
        {
            bill = 1.20*unit;
        }
        else if(unit>=100 && unit<200)
        {
            bill = 100*1.20 + (unit - 100*2);
        }
        else
        {
            bill = 100*1.20 + (unit - 100*2) + (unit - 200+3);
        }
        System.out.println("Bill = "+bill);
    }
}