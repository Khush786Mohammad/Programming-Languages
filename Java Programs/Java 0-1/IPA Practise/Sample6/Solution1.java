import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cnt = 0;

        for(int i = 0 ; i<str.length() ; i++){
            if(Character.isLowerCase(str.charAt(i))){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();

        System.out.println("Alternate Solution");

        //alternate solution

        int ans = 0;
        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <='z'){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
