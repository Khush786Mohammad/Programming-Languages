import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<str.length() ; i++){
            if(i%2 != 0){
                char c = str.charAt(i);
                sb.append(c);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
