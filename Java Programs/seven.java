//Show copy constructor student class.

class student
{
     int roll_no;
     String name;

     student(int no , String name)
     {
         this.roll_no = no;
         this.name = name;
     }
     student(student std)
     {
         System.out.println("After invoking copy constructor");
         roll_no = std.roll_no;
         name = std.name;
     }
     void show()
     {
         System.out.println("Roll NO="+roll_no);
         System.out.println("Name = "+name);
     }
};
public class seven
{
    public static void main(String[] args)
    {
        student s = new student(20 , "khush");
        s.show();
        student s1 = new student(s);
        s1.show();
    }
}