import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];

        for(int i = 0 ; i<str.length() ; i++){
            int idx = str.charAt(i)-97;
            arr[idx]++;
        }
        for(int i = 0 ; i<26 ; i++){
            if(arr[i] != 0){
                char ch = (char)(97+i);
                sb.append(ch);
                sb.append(arr[i]);
            }
        }

        System.out.println(sb);
        sc.close();
    }
}
