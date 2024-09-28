import java.util.*;
public class condition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if(age >= 0 && age <= 2){
            System.out.println("Baby");
        }
        else if(age > 3 && age <= 6)
        {
            System.out.println("Toddler");
        }
        else if( age >= 7 && age <= 17){
            System.out.println("Teen");
        }
        else if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Invalid");
        }

        //while loops
        int guessNumber;
        Random rand = new Random();
        int number = rand.nextInt(100);
        do{
            System.out.println("Guess the number");
            guessNumber = sc.nextInt();
            if(guessNumber > number){
                System.out.println("Your number is bit higher");
            }
            else if( guessNumber < number){
                System.out.println("Your number is bit lower!");
            }
            else{
                System.out.println("yee");
            }
        }while(number != guessNumber);
    }
}