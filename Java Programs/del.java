//Write a method called delete(String str , int m) that return the input string with 'm' element is removed
import java.util.*;
public class del
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String");
        String str = sc.nextLine();
        System.out.println("Enter the position");
        int position = sc.nextInt();
        str = str.deleteCharAt(position);

        System.out.println("String = " +str);  
    }
}


//khush  3  
//khuh