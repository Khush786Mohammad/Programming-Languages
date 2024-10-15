import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int myAns = 0;
        while(temp != 0){
            int rem = temp%10;
            temp = temp/10;
            myAns = myAns*10 + rem;
        }

        System.out.println(myAns);
        sc.close();
    }
}