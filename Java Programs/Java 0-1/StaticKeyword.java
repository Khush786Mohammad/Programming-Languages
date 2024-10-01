class Employee{
    private String name;
    static int count=0;

    public Employee(String name){
        System.out.println("Parameterized Constructor");
        this.name = name;
        count++;
    }

    public int displayCounter(){
        return count;
    }
}

public class StaticKeyword{
    public static void main(String[] args){
        Employee e1 = new Employee("Khush");
        Employee e2 = new Employee("Umar");
        Employee e3 = new Employee("Utmaan");

        System.out.println(e2.displayCounter());

        System.out.println(Employee.count);
    
    }
}