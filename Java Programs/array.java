import java.util.*;

public class array
{
    public static void main(String[] args)
    {
        //  int array[] = new int[5];
        //  array[0] = 21;
        //  array[1] = 22;
        //  array[2] = 23;
        //  array[3] = 24;
        //  array[4] = 25;

        //  for(int i = 0 ;i<array.length ;i++)
        //  {
        //      System.out.println(array[i]);
        //  }
/*
        int array[] = {21,22,23,24,25};
        for(int i = 0 ; i<array.length ;i++)
        {
            System.out.println(array[i]);
        }
        */

        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Enter the array elements");
        for(int i = 0 ; i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i = 0 ;i<array.length;i++)
        {
            System.out.println(array[i]*2);
        }
    }
}