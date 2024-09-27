import java.util.*;
public class search
{
    public static void main(String[] args)
    {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements in array");

        for(int i = 0 ;i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
          
        System.out.println("Enter the element to be search in array");
        int key = sc.nextInt();
        Arrays.sort(arr);
        int flag= 0;
        for(int i = 0 ;i<arr.length ; i++)
        {
            if(key == arr[i])
            {
                System.out.println("Search element found at " +i+ " index");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Element not found in array");
        }

    }
}