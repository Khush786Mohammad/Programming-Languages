/* Count number of even digit in a number
 * If the count greater than or equal to 3, then print "True" otherwise "False"
 */

import java.util.Scanner;

public class Solution3 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int cnt = 0;
    String str = String.valueOf(num);
    for(int i = 0 ; i<str.length();  i++){
        // int value = (int)str.charAt(i);
        int value = Integer.parseInt(String.valueOf(str.charAt(i)));
        if(value %2 == 0)
        cnt++;
    }
    if(cnt >= 3)
    System.out.println("True");
    else
    System.out.println("False");
   } 
}
