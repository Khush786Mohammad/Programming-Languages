import java.util.*;
 public class lab
 {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         String ans = "Dennis Ritchie";
         
         
         int count = 0;
         
         while(count<3)
         {
              System.out.println("Who is the inventor of C language");
              String name = sc.nextLine();
              boolean var =ans.equalsIgnoreCase(name);
             if(var)
            {
                System.out.println("Good");
                System.exit(1);
            }
        
         else
          {
             
             System.out.println("Try Again");
             count++ ;
          }
        }
        System.out.println("Correct Answer is Dennis Ritchie");

     }
 }