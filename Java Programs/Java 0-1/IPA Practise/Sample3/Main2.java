import java.util.Scanner;
public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        char operator = sc.next().charAt(0);

        switch(operator){
            case '+':
            System.out.println(num1+num2);
            break;

            case '-':{
                System.out.println(num1-num2);
                break;
            }

            case '*':{
                System.out.println(num1*num2);
                break;
            }

            case '/':{
                if(num2 != 0){
                    System.out.println(num1/num2);
                }
                else{
                    System.out.println("Error!!! Dividing by zero");
                }
                break;
            }

            default:
            System.out.println("Invalid Operation");
        }
    }
}