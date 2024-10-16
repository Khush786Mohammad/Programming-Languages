import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class Employee{
    private int empId;
    private String empName;
    private int age;
    private char gender;
    private double salary;
    
    public Employee(int empId, String empName, int age, char gender, double salary){
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpId(){
        return this.empId;
    }
    public String getEmpName(){
        return this.empName;
    }
    public int getAge(){
        return this.age;
    }
    public char getGender(){
        return this.gender;
    }
    public double getSalary(){
        return this.salary;
    }
}

class SortBySalary implements Comparator<Employee>{
    @Override
    public int compare(Employee obj1 , Employee obj2){
        return Double.compare(obj1.getSalary(), obj2.getSalary());
    }
}

public class Solution {
    public static void main(String[] args){
        Comparator<Employee> sortBySalary = Comparator.comparingDouble(Employee::getSalary);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size\n");
        int size = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[size];

        for(int i = 0 ; i<size ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            char gender = sc.next().charAt(0);
            double salary = sc.nextDouble();

            employees[i] = new Employee(id,name,age,gender,salary);
        }
        System.out.println("Enter the age to be search for");

        int searchAge = sc.nextInt();

        int empCount = countEmployeesBasedOnAge(searchAge,employees);

            // Employee obj = getEmployeeWithSecondLowestSalary(employees,sortBySalary);
            Employee obj = getEmployeeWithSecondLowestSalary(employees);
            
            if(obj != null){
                System.out.println(obj.getEmpId()+"#"+obj.getEmpName());
            }
            else{
                System.out.println("Null");
            }
            if(empCount == 0){
                System.out.println("No employee found for the given age");
            }
            else{
                System.out.println(empCount);
            }
        sc.close();
    }

    public static Employee getEmployeeWithSecondLowestSalary(Employee[] employees /*Comparator<Employee> sortBySalary */){
        if(employees.length < 2)
        return null;
        //using basic sorting alogrithm
       /* int size = employees.length;
        for(int i = 0 ; i<size ; i++){
            int mini = i;
            for(int j = i+1; j<size ; j++){
                if(employees[j].getSalary() < employees[mini].getSalary()){
                    mini = j;
                }
            }
            if(i != mini){
                Employee temp = employees[i];
                employees[i] = employees[mini];
                employees[mini] = temp; 
            }
        }
        if(employees.length < 2){
            return null;
        }
        else{
            return employees[1];
        }
            */

        //Using comparator

        Arrays.sort(employees,new SortBySalary());
        
        double SecondLowestSalary = employees[0].getSalary();
        for(int i = 1 ; i<employees.length ; i++){
            if(employees[i].getSalary() > SecondLowestSalary){
                return employees[i];
            }
        }
        return null;
    }

    public static int countEmployeesBasedOnAge(int searchAge, Employee[] employees){
        int count = 0;
        for(Employee emp: employees){
            if(emp.getAge() == searchAge){
                count++;
            }
        }
        return count;
    }
}
