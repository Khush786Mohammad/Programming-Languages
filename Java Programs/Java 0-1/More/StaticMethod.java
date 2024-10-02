// create a student class with college name as static and set a counter to the number of student enroll everytime in the college

class Student{
    public static String collegeName;
    public String studentName;
    public int rollNo;
    protected static int count;

    public Student(String studentName, int rollNo){
        this.studentName = studentName;
        this.rollNo = rollNo;
        count++;
    }

    public static void setCollegeName(String name){
        collegeName = name;
    }
    public String getStudentName(){
        return this.studentName;
    }

    public int getRollNo(){
        return this.rollNo;
    }
}

public class StaticMethod{
    public static void main(String[] args){
        Student.setCollegeName("Graphic Era");
        Student s1 = new Student("khush", 14);
        Student s2 = new Student("Lokesh",15);
        Student s3 = new Student("Sunny", 19);

        System.out.println(s3.getStudentName() + s3.getRollNo());
        System.out.println("No of student in : "+Student.collegeName +" are " +Student.count);
    }
}