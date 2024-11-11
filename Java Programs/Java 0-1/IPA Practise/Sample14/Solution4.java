/* Write a Java program that takes a user input integer n and prints the Fibonacci series up to n.

The Fibonacci series is a series of numbers in which each number is the sum of the two preceding numbers. 
The first two numbers in the series are 0 and 1. For example, the first 10 numbers in the Fibonacci series are: 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

The program should use a for loop to generate the series.

Sample Input:
20

Sample Output:
0 1 1 2 3 5 8 13

Explanation:
The Fibonacci series up to 20 is: 0, 1, 1, 2, 3, 5, 8, 13. Therefore, the output is "0 1 1 2 3 5 8 13".*/
import java.util.Scanner; 
public class Solution4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        if(first<=n){
            System.out.println(first);
        }
        if(second <= n){
            System.out.println(second);
        }

        while(n >= first+second){
            int sum = first+second;
            first = second;
            second = sum;

            System.out.println(sum);
        }
    }
}
