import java.util.*;
class student
{
    int roll_no;
    int age;
    String name;
    String course;

    student()
    {
        this.roll_no = 14;
        this.age = 20;
        this.name = "Khush";
        this.course = "B.TECH";
    }
    void showdata()
    {
        System.out.println("Roll NO = "+roll_no);
        System.out.println("Age = "+age);
        System.out.println("Name = "+name);
        System.out.println("Course = "+course);
    }
};
public class third
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        student stdd = new student();
        stdd.showdata();
    }
}