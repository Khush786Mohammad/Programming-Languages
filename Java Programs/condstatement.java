import java.util.Scanner;


public class condstatement
{
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        // char grade;
        // System.out.println("Enter your grade");

        // grade = sc.next().charAt(0);
        // if(grade == 'A')
        // System.out.println("Excellent work");
        // else if (grade == 'B')
        // System.out.println("Good work");
        // else if (grade == 'C')
        // System.out.println("Improvement");
        // else
        // System.out.println("Poor Grade");

        Scanner obj = new Scanner(System.in);
        char grade;
        System.out.println("Enter your grade");
        grade = obj.next().charAt(0);

        switch(grade)
        {
            case 'a':
            case 'A':
            System.out.println("Your grade is excellent");
            break;
            case 'b':
            System.out.println("Your grade is good");
            break;
            case 'c':
            System.out.println("Your grade is average");
            break;
            default:
            System.out.println("Your grade is poor");
        }
    }
}