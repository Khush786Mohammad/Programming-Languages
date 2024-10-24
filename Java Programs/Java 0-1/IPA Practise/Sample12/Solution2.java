import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Associate{
    private int id;
    private String name;
    private String technology;
    private int expInYears;

    public Associate(int id, String name, String technology, int expInYears){
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.expInYears = expInYears;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getTechnology(){
        return this.technology;
    }
    public int getExp(){
        return this.expInYears;
    }
}

public class Solution2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Associate[] associate = new Associate[5];

        for(int i = 0 ; i<5 ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String tech = sc.nextLine();
            int exp = sc.nextInt();
            sc.nextLine();

            associate[i] = new Associate(id, name, tech, exp);
        }
        
        String searchTech = sc.nextLine();
        List<Associate> ans = associatesForGivenTechnology(associate, searchTech);

        if(ans.isEmpty()){
            System.out.println("No such Associates");
        }
        else{
            for(Associate as: ans){
                System.out.println(as.getId());
            }
        }
    }

    public static List<Associate> associatesForGivenTechnology(Associate[] associate, String searchTech){
        List<Associate> ans = new ArrayList<>();

        for(Associate as : associate){
            if(as.getTechnology().equalsIgnoreCase(searchTech) && as.getExp()%5 == 0){
                ans.add(as);
            }
        }
        return ans;
    }
}