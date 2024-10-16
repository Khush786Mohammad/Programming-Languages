import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }
    public String getDesignation(){
        return this.designation;
    }
}

class Company{
    private String companyName;
    private int numEmployees;
    private Employee[] arr;

    public Company(String companyName, int numEmp, Employee[] arr){
        this.companyName = companyName;
        this.numEmployees = numEmp;
        this.arr = arr;
    }

    public double getAvgSalary(){
        double totalSalary = 0.0;
        for(Employee emp: this.arr){
            double sal = emp.getSalary();
            totalSalary += sal;
        }
        return totalSalary/this.numEmployees;
    }

    public double getMaxSalary(){
        for(int i = 0 ; i<this.numEmployees ; i++){
            int maxi = i;
            for(int j = i+1; j<this.numEmployees ; j++){
                if(this.arr[j].getSalary() > this.arr[maxi].getSalary()){
                    maxi = j;
                }
            }
            if(i != maxi){
                Employee temp = this.arr[i];
                this.arr[i] = this.arr[maxi];
                this.arr[maxi] = temp;
            }
        }
        return this.arr[0].getSalary();
    }
    public Employee[] getEmployeesByDesignation(String s){
        Employee[] det = new Employee[0];
        for(Employee emp: this.arr){
            String currDesignation = emp.getDesignation();

            if(s.equalsIgnoreCase(currDesignation)){
                det = Arrays.copyOf(det, det.length+1);
                det[det.length-1] = emp;
            }
        }
        return det;
    }
}

public class Solution {
    public static void main(String[] args){
        Comparator<Employee> sortById = Comparator.comparingInt(Employee::getId);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Company name: ");
        String compName = sc.nextLine();
        System.out.println("Enter number of employees: ");
        int empCount = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[empCount];
        System.out.println("Enter employee details: \n");

        for(int i = 0 ; i<empCount ; i++){
            // id, name, designation, and salary
            System.out.println("Employee "+ (i+1) +":");

            System.out.println("Enter id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Designation: ");
            String designation = sc.nextLine();

            System.out.println("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = new Employee(id, name, designation, salary);
        }

        Company obj = new Company(compName,empCount,employees);

        double avgSalary = obj.getAvgSalary();
        double maxSalary = obj.getMaxSalary();

        System.out.println("Average Salary: "+avgSalary);
        System.out.println("Maximum Salary: "+maxSalary);

        System.out.println("Enter the designation: ");
        String searchDesignation = sc.nextLine();
        Employee[] str = obj.getEmployeesByDesignation(searchDesignation);
        System.out.println("Employees with designation: "+searchDesignation);

        Arrays.sort(str, sortById);

        for(int i = 0 ; i<str.length ; i++){
            int id = str[i].getId();
            String name = str[i].getName();
            String designation = str[i].getDesignation();
            double salary = str[i].getSalary();

            System.out.println("Id: "+id+", Name: "+name+", Designation: "+designation+", Salary: "+salary);
        }
    }
}
