//Find minimum and maximum element in array.
import java.util.*;
public class find
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[]  = new int[10];
        System.out.println("Enter the elements in array");
        for(int i = 0 ; i<a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        int max = a[0]; 
        for(int i = 1 ;i<a.length ; i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        int min = a[0];
        for(int i = 1 ;i<a.length ; i++)
        {
            if(min>a[i])
            {
                min = a[i];
            }
        }
        System.out.println("Minimum Element = " +min+ " Maximum Element = " +max);
    }
}