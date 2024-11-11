//factorial of a number using biginteger

import java.util.Scanner;
import java.math.BigInteger;

public class Solution5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger ans = fact(n);
        System.out.println(ans);
    }
    public static BigInteger fact(int num){
        if(num <= 1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(fact(num-1));
    }
}