import java.util.*;
import java.util.regex.*;
public class regexClass {
    public static void main(String[] args){
        String str = "Khush Mohammad is a learner";

        String strArr[] = str.split(" ");
        for(int i = 0 ;i<strArr.length ; i++){
            System.out.println(strArr[i]);
        }
    }
}
