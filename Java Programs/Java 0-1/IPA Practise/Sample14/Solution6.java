import java.util.Scanner;
import java.util.regex.*;
public class Solution6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int cnt = 0;
        for(int i = 0 ; i<arr.length ; i++){
            String temp = arr[i];
            if(Character.isUpperCase(temp.charAt(0))){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
