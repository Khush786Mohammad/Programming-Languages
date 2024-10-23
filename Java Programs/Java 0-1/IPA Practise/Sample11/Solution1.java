import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student{
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;

    public Student(int rollNo, String name, String subject, char grade, String date){
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public int getRollNo(){
        return this.rollNo;
    }

    public String getName(){
        return this.name;
    }
    public String getSubject(){
        return this.subject;
    }
    public char getGrade(){
        return this.grade;
    }
    public String getDate(){
        return this.date;
    }
}

class SortByRollNo implements Comparator<Student>{
    @Override
    public int compare(Student obj1, Student obj2){
        return Integer.compare(obj1.getRollNo(), obj2.getRollNo());
    }
}

public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        for(int i = 0 ; i<n ; i++){
            int rollNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String subject = sc.nextLine();
            char grade = sc.nextLine().charAt(0);
            String date = sc.nextLine();

            students.add(new Student(rollNo, name, subject, grade, date));
        }

        char searchGrade = sc.next().charAt(0);
        int month = sc.nextInt();

        List<Student> ans = findStudentByGradeAndMonth(students, searchGrade, month);

        Collections.sort(ans, new SortByRollNo());

        if(!ans.isEmpty()){
            for(Student std: ans){
                System.out.println(std.getName());
                System.out.println(std.getSubject());
            }
            System.out.println(ans.size());
        }
        else{
            System.out.println("No Student Found");
        }
    }

    public static List<Student> findStudentByGradeAndMonth(List<Student> student, char searchGrade, int searchMonth){
        List<Student> ans = new ArrayList<>();
        for(Student std : student){
            String date = std.getDate();
            String[] dateArray = date.split("/");
            int month = Integer.parseInt(dateArray[1]);
            if(Character.toLowerCase(std.getGrade()) == Character.toLowerCase(searchGrade) && month == searchMonth){
                ans.add(std);
            }
        }
        return ans;
    }
}