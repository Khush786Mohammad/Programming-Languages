import java.util.Scanner;

class Flowers{
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    public Flowers(int flowerId, String flowerName, int price, int rating, String type){
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }
    public int getFlowerId(){
        return this.flowerId;
    }
    public String getFlowerName(){
        return this.flowerName;
    }
    public int getPrice(){
        return this.price;
    }
    public int getRating(){
        return this.rating;
    }
    public String getType(){
        return this.type;
    }
}
public class Solution3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Flowers[] flowers = new Flowers[n];

        for(int i = 0 ; i<n ; i++){
            int flowerId = sc.nextInt();
            sc.nextLine();
            String flowerName = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            int rating = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();

            flowers[i] = new Flowers(flowerId, flowerName, price, rating, type);
        }

        String searchType = sc.nextLine();

        Flowers objAns = findMinPriceByType(flowers, searchType);

        if(objAns != null){
            System.out.println(objAns.getFlowerId());
        }
        else{
            System.out.println("There is no flower with given type");
        }
    }

    public static Flowers findMinPriceByType(Flowers[] flowers, String searchType){
        int mini = Integer.MAX_VALUE;
        Flowers obj = null;

        for(Flowers fl : flowers){
            if(fl.getType().equalsIgnoreCase(searchType)){
                if(fl.getRating() > 3 && fl.getPrice() < mini){
                    obj = fl;
                    mini = fl.getPrice();
                }
            }
        }
        return obj;
    }
}