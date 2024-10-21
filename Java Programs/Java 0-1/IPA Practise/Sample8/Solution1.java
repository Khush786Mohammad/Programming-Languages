import java.util.Scanner;

class Employee{
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public Employee(int employeeId, String name, String branch, double rating, boolean transport){
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }
    public String getName(){
        return this.name;
    }
    public String getBranch(){
        return this.branch;
    }
    public double getRating(){
        return this.rating;
    }
    public boolean haveTransport(){
        return this.transport;
    }
}

public class Solution1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[n];

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();
            sc.nextLine();
            boolean transport = sc.nextBoolean();
            sc.nextLine();

            employees[i] = new Employee(id, name, branch, rating, transport);
        }

        String searchBranch = sc.nextLine();

        int ans = findCountOfEmployeesUsingCompTransport(employees, searchBranch);
        Employee obj = findEmployeeWithSecondHighestRating(employees);

        if(ans != 0){
            System.out.println(ans);
        }
        else{
            System.out.println("No such Employees");
        }

        if(obj != null){
            System.out.println(obj.getEmployeeId() + " " +obj.getName());
        }
        else{
            System.out.println("All Employees using company transport.");
        }
    }

    public static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String searchBranch){
        int count = 0;
        for(Employee emp: employees){
            if(emp.getBranch().equalsIgnoreCase(searchBranch)){
                if(emp.haveTransport()){
                    count++;
                }
            }
        }
        return count;
    }

    public static Employee findEmployeeWithSecondHighestRating(Employee[] employees){
        double maxi = Integer.MIN_VALUE;
        Employee maxiObj = null;
        
        double secondMaxi = Integer.MIN_VALUE;
        Employee secondMaxiObj = null;

        for(Employee emp: employees){
            if(!emp.haveTransport()){
                double rating = emp.getRating();
                if(rating > maxi){
                    secondMaxi = maxi;
                    secondMaxiObj = maxiObj;

                    maxi = rating;
                    maxiObj = emp;
                }
                else if(rating > secondMaxi && rating != maxi){
                    secondMaxi = rating;
                    secondMaxiObj = emp;
                }
            }
        }
        return secondMaxiObj;
    }
}
