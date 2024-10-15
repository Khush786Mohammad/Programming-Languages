import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == armstrong(num)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }

    public static int armstrong(int num){
        /*
         * int totalDigit = 0;
        int finalNum = 0;
        int temp = num;
        while(temp != 0){
            temp = temp/10;
            totalDigit++;
        }

        while(num != 0){
            int rem = num % 10;
            finalNum += Math.pow(rem,totalDigit);
            num /= 10;
        }
        return finalNum;
         */
    String str = Integer.toString(num);
        int finalNum = 0;
        int pow = str.length();

        while(num != 0){
            int rem = num % 10;
            finalNum += Math.pow(rem,pow);
            num /= 10;
        }
        return finalNum;
    }
}