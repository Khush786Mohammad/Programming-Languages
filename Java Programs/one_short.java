import java.util.*;
public class one_short
{
    public static void main(String[] args)
    {
        // Taking values from user.
        //scanner is used to take standard inputs.

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name");
        
        String name = obj.nextLine();
       

        System.out.println("Enter your age");
        int age = obj.nextInt();

        System.out.println("Name = " +name);
        System.out.println("Age = "+age);


    }
}