import java.util.*;

public class logicaloperator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");

        age = sc.nextInt();

        if(age> 10 && age < 20)
        {
            System.out.println("You are above 18 and below 50");
        }
        else
        System.out.println("Oh bhai kar kya raha h tu");
       
    }
}