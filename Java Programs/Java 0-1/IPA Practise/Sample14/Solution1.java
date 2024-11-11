/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
import java.util.Comparator;
import java.util.Collections;

public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        int cnt = 0;
        for(int i = 0 ; i<str.length(); i++){
            int value = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(isPrime(value)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean isPrime(int num){
        if(num <= 1)
        return false;

        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0)
            return false;
        }
        return true;
    }
}