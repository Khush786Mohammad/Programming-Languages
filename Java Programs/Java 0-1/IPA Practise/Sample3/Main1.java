import java.util.Scanner;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[size];

        for(int i = 0 ; i<size;  i++){
            arr[i] = sc.nextInt();
        }
        
        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();

        int lowerIdx = findIndex(arr,lowerLimit);
        int upperIdx = findIndex(arr,upperLimit);        

        if(upperIdx == 0){
            System.out.println(-1);
        }

        //check if the two limit is same
        int sum = 0;
        if(lowerIdx != upperIdx || upperIdx > lowerIdx + 1){
            for(int i = lowerIdx+1 ; i<upperIdx ; i++){
                sum += arr[i];
            }
            sum = sum/(upperIdx - lowerIdx-1);
            System.out.println(sum);
        }
        else
        System.out.println("Invalid Range");
    }

    public static int findIndex(int[] arr, int elem){
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            if(arr[i] == elem){
                return i;
            }
        }
        return -1;
    }
}