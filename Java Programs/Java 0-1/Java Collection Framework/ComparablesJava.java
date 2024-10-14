import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    private String name;
    private int empId;

    public Employee(String name, int id){
        this.name = name;
        this.empId = id;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.empId;
    }

    public String toString(){
        return empId + " "+ name;
    }

    @Override
    public int compareTo(Employee other){
        return Integer.compare(this.empId,other.empId);
    }
}

public class ComparablesJava {
    public static void main(String[] args){
        List<Employee> employeesList = new ArrayList<Employee>();
        addEmployeesDetails(employeesList);

        for(Employee emp: employeesList){
            System.out.println(emp.toString());
        }

        System.out.println("--------------\n");



        Collections.sort(employeesList);
        for(Employee emp: employeesList){
            System.out.println(emp.toString());
        }
    }

    public static void addEmployeesDetails(List<Employee> employees){
        employees.add(new Employee("kinomao", 102));
        employees.add(new Employee("hatan",30));
        employees.add(new Employee("misii", 103));
        employees.add(new Employee("Zoro", 110));
        employees.add(new Employee("Xavier", 11));
    }
}
