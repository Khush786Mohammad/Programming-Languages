import java.util.Scanner;

public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        String[] array = str.split(" ");

        for(int i = 0 ; i<array.length ; i++){
            String temp = array[i];
            boolean flag = false;
            for(int j = 0 ; j<temp.length() ; j++){
                if(temp.charAt(j) == 'a' || temp.charAt(j) == 'e' || temp.charAt(j) == 'i' || temp.charAt(j) == 'o' || temp.charAt(j) == 'u'){
                    if(flag){
                        count++;
                        break;
                    }
                    else{
                        flag = true;
                    }
                }
                else{
                    flag = false;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}