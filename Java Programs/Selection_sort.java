import java.util.*;

public class Selection_sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        

        int arr[] = new int[10];

        System.out.println("Enter the elements in array");
        for(int i= 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        //Selection Sort.

        for(int i=0;i<arr.length;i++)
        {
            for(int j = i+1 ; j<arr.length ; j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Elements are");
        for(int i = 0 ;i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}