import java.util.*;

public class binary_search
{
    public static void func(int a[], int low , int high , int key)
    {
        for(int i = 0 ; i<high ;i++)
        {
           if(low<=high)
           {
               int mid = (low + high)/2;
               if(key == a[mid])
               {
                   System.out.println("Element found at index "+mid);
                   System.exit(1);
               }
               else if(key<a[mid])
               {
                   func(a , low , mid-1, key);
               }
               else
               {
                   func(a , mid+1, high , key);
               }
           }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements");
        for(int i = 0 ;i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element to be search");
        int key = sc.nextInt();

        func(arr , 0 , size-1 ,key);

    }
}