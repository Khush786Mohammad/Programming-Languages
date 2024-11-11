/* Find largest word from a given sentence
 * 
 Input: He is so funny boy
 Output: funny
 */
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str= sc.nextLine();
        String[] arr = str.split(" ");
        String largest = "";

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i].length() > largest.length()){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
