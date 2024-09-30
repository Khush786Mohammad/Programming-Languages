class Person{
    private String name;
    private int age;

    public void speak(){
        System.out.println("Hy how are you");
    }

    //setter

    public void setDetails(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void showPersonDetails(){
        System.out.println("Name is : " +this.name + " " +this.age);
    }

    //getter
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}

class Student extends Person{
    private String course;
    private String branch;

    public Student(){
        System.out.println("Default Constructor");
    }

    public Student(String course , String branch){
        this.course = course;
        this.branch = branch;
    }

    public void showStudentDetail(){
        System.out.println("Course is : " +this.course + " " +this.branch);
    }
}

public class GetterSetter {
    public static void main(String[] args){
        Person person = new Person();
        person.setDetails("Khush", 22);
        String personName = person.getName();
        int personAge = person.getAge();

        System.out.println("Person name is : " +personName +" Person Age is : " +personAge);
        Student student = new Student("B.Tech","CSE");
        student.setDetails("Umar",40);
        student.showPersonDetails();
        student.showStudentDetail();
    }
}
