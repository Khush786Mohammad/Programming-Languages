import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Inventory{
    private String inventoryId;
    private int maxQuantity;
    private int currQuantity;
    private int threshold;

    public Inventory(String inventoryId, int maxQuantity, int currQuantity, int threshold){
        this.inventoryId = inventoryId;
        this.maxQuantity = maxQuantity;
        this.currQuantity = currQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId(){
        return this.inventoryId;
    }
    public int getMaxQuantity(){
        return this.maxQuantity;
    }
    public int getCurrQuantity(){
        return this.currQuantity;
    }
    public int getThreshold(){
        return this.threshold;
    }
}

public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Inventory> inventory = new ArrayList<>();

        // int n = sc.nextInt();
        // sc.nextLine();

        for(int i = 0 ; i<4 ; i++){
            String id = sc.nextLine();
            int maxQuan = sc.nextInt();
            sc.nextLine();
            int currQuan = sc.nextInt();
            sc.nextLine();
            int threshold = sc.nextInt();
            sc.nextLine();

            inventory.add(new Inventory(id, maxQuan, currQuan, threshold));
        }
        int limit = sc.nextInt();
        List<Inventory> ans = Replenish(inventory, limit);

        for(Inventory in: ans){
            if(in.getThreshold() > 75){
                System.out.println("Critical Filling");
            }
            else if(in.getThreshold() >= 50 && in.getThreshold() <= 75){
                System.out.println("Moderate Filling");
            }
            else{
                System.out.println("Non-Critical Filling");
            }
        }

    }

    public static List<Inventory> Replenish(List<Inventory> inventory, int limit){
        List<Inventory> ans = new ArrayList<>();

        for(Inventory in : inventory){
            if(limit>= in.getThreshold()){
                ans.add(in);
            }
        }
        return ans;
    }
}