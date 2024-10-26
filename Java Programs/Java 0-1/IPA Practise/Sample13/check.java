import java.util.Scanner;

public class check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] selfProduct = new int[n];
        for(int i = 0 ; i<n ; i++){
            int value = sc.nextInt();
            int selfPro = sc.nextInt();
            arr[i] = value;
            selfProduct[i] = selfPro;
        }
        System.out.println("---------------------");

        for(int vals: arr){
            System.out.println(vals);
        }

        System.out.println("---------------------");
        for(int vals: selfProduct){
            System.out.println(vals);
        }
    }
}
