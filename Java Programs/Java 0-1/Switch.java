import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for add \nEnter 2 for subract \nEnter 3 for multiply \nEnter 4 for divide");
        int operation = sc.nextInt();
        int num1 , num2;

        switch(operation){
            case 1:
            System.out.println("Enter the two numbers");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.printf("Sum of %d %d is %d", num1, num2, num1+num2).println();
            break;

            case 2:
            System.out.println("Enter the two numbers");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.printf("Difference of %d %d is %d", num1, num2, num1-num2).println();
            break;

            case 3:
            System.out.println("Enter the two numbers");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.printf("Product of %d %d is %d", num1, num2, num1*num2).println();
            break;

            case 4:
            System.out.println("Enter the two numbers");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.printf("Division of %d %d is %d", num1, num2, num1/num2).println();
            break;

            default:
            System.out.println("Ambiguous Operation");

        }
    }
}
