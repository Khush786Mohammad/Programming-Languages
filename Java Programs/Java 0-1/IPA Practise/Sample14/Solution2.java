/* Count number of vowel, consonent and digit into a string */
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "khsu52Hi3oi1u1s23USe";

        int vowelCnt = 0;
        int consonentCnt = 0;
        int digitCnt = 0;
        for(int i = 0 ; i<str.length() ; i++){
            if(Character.toUpperCase(str.charAt(i)) == 'A' || Character.toUpperCase(str.charAt(i)) == 'E' || Character.toUpperCase(str.charAt(i)) == 'I' || Character.toUpperCase(str.charAt(i)) == 'O' || Character.toUpperCase(str.charAt(i)) == 'U')
            vowelCnt++;
            else if(Character.isDigit(str.charAt(i)))
            digitCnt++;
            else
            consonentCnt++;
        }

        System.out.println("Vowels: "+vowelCnt+", Consonent: "+consonentCnt+", Digit: "+digitCnt);
    }
}
