// Find the first non repeated character substring
//Arijit = Arij

import java.util.Scanner;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Solution7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();

        String str = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<str.length() ; i++){
            if(!set.contains(str.charAt(i))){
                sb.append(str.charAt(i));
                set.add(str.charAt(i));
            }
            else{
                break;
            }
        }
        System.out.println(sb);
    }
}