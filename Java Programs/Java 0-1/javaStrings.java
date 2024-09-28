import java.util.*;
public class javaStrings{
    public static void main(String[] args){
        String myName = "Khush";
        char firstChar = myName.charAt(0);
        System.out.println("Hello My name is " + myName);
        System.out.println("Your first name character is " + firstChar);

        //read from input 

        Scanner sc = new Scanner(System.in);
        String lastName = sc.next();
        
        System.out.println("Your Full Name is " + myName + " " + lastName);

        String degree = sc.nextLine();

        System.out.println("Your Graduation degree is in " + degree);

        String s = "fog";
        String replaced = s.replace('f', 'd');
        System.out.println(replaced);

    }
}