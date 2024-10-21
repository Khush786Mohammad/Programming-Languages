import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class AutonomousCar{
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;

    private String grade;

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment){
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public int getCarId(){
        return this.carId;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getNoOfTestsConducted(){
        return this.noOfTestsConducted;
    }
    public int getNoOfTestsPassed(){
        return this.noOfTestsPassed;
    }
    public String getEnvironment(){
        return this.environment;
    }

    public String getGrade(){
        return this.grade;
    }
}

public class Solution3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<AutonomousCar> list = new ArrayList<AutonomousCar>();

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            int testCond = sc.nextInt();
            sc.nextLine();
            int testPass = sc.nextInt();
            sc.nextLine();
            String environment = sc.nextLine();

            list.add(new AutonomousCar(id, brand, testCond, testPass, environment));
        }

        String env = sc.nextLine();
        String sBrand = sc.nextLine();
        int total = noOfTestsPassed(list, env);
        List<AutonomousCar> ans = updateCarGrade(list, sBrand);

        if(total != 0){
            System.out.println(total);
        }
        else{
            System.out.println("There are no tests passed in this particular environment");
        }

        if(!list.isEmpty()){
            for(AutonomousCar ac: ans){
                System.out.println(ac.getBrand()+"::"+ac.getGrade());
            }
        }
        else{
            System.out.println("No Car is available with the specified brand");
        }
        sc.close();
    }

    public static int noOfTestsPassed(List<AutonomousCar> list, String env){
        int total = 0;
        for(AutonomousCar ac : list){
            if(ac.getEnvironment().equalsIgnoreCase(env)){
                total += ac.getNoOfTestsPassed();
            }
        }
        return total;
    }

    public static List<AutonomousCar> updateCarGrade(List<AutonomousCar> list, String sBrand){
        List<AutonomousCar> ans = new ArrayList<AutonomousCar>();

        for(AutonomousCar ac: list){
            if(ac.getBrand().equalsIgnoreCase(sBrand)){
                int rating = (ac.getNoOfTestsPassed()*100)/ac.getNoOfTestsConducted();

                if(rating >= 80){
                    ac.setGrade("A1");
                }
                else{
                    ac.setGrade("B2");
                }

                ans.add(ac);
            }
        }
        return ans;
    }
}