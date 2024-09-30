class Person{
    private String name ;
    private int age ; 

    //constructor
    public Person(){
        System.out.println("Default Constructor for Person class");
    }

    public Person(String name, int age){
        System.out.println("Parameterized Constructor for Person class");
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void sayHello(){
        System.out.println("Hello this is a person class");
    }
}

class Student extends Person{
    private String course;
    private String branch;
    private int rollNo;

    public Student(){
        System.out.println("Default Constructor for Student class");
    }

    public Student(String name, int age, String course, String branch, int rollNo){
        super(name,age);
        this.course = course;
        this.branch = branch;
        this.rollNo = rollNo;
        System.out.println("Parameterized Constructor for Student class");
    }

    //getter methods

    public String getCourse(){
        return this.course;
    }

    public String getBranch(){
        return this.branch;
    }

    public int getRollNo(){
        return this.rollNo;
    }
}

public class SuperKeyword {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("Khush",22);

        p1.sayHello();

        System.out.println("Person name is "+p2.getName() + " Person Age is " +p2.getAge());

        Student std1 = new Student();
        Student std2 = new Student("Khush", 22, "B.Tech","CSE",220011);
        System.out.println("Student name is " +std2.getName()+ " Student age is "+std2.getAge() +" Branch is " +std2.getCourse()+" "+std2.getBranch()+" roll no is: "+std2.getRollNo());
        std1.sayHello();
    }
}
