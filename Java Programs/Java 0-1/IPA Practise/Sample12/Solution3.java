import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Institution{
    private int id;
    private String name;
    private int studentPlaced;
    private int studentCleared;
    private String location;
    private String grade;

    public Institution(int id, String name, int studentPlaced, int studentCleared, String location){
        this.id = id;
        this.name = name;
        this.studentPlaced = studentPlaced;
        this.studentCleared = studentCleared;
        this.location = location;
    }

    //set grade
    public void setGrade(String grade){
        this.grade = grade;
    }

    //getters

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getPlaced(){
        return this.studentPlaced;
    }
    public int getCleared(){
        return this.studentCleared;
    }
    public String getLocation(){
        return this.location;
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

        List<Institution> list = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int placed = sc.nextInt();
            sc.nextLine();
            int cleared = sc.nextInt();
            sc.nextLine();
            String location = sc.nextLine();

            list.add(new Institution(id, name, placed, cleared, location));
        }

        String searchLoc = sc.nextLine();
        String instName = sc.nextLine();

        int total = FindNumClearancedByLoc(list, searchLoc);
        Institution obj = UpdateInstitutionGrade(list, instName);

        if(total!=0){
            System.out.println(total);
        }
        else{
            System.out.println("There are no cleared students in this particular location");
        }

        if(obj != null){
            System.out.println(obj.getName()+"::"+obj.getGrade());
        }
        else{
            System.out.println("No Institute is available with the specified name");
        }
    }

    public static int FindNumClearancedByLoc(List<Institution> list, String searchLoc){
        int total = 0;

        for(Institution inst : list){
            if(inst.getLocation().equalsIgnoreCase(searchLoc)){
                total+=inst.getCleared();
            }
        }
        return total;
    }

    public static Institution UpdateInstitutionGrade(List<Institution> list, String instName){
        for(Institution inst: list){
            if(inst.getName().equalsIgnoreCase(instName)){
                int rating = (inst.getPlaced()*100)/(inst.getCleared());
                if(rating >= 80){
                    inst.setGrade("A");
                }
                else{
                    inst.setGrade("B");
                }
                return inst;
            }
        }
        return null;
    }
}