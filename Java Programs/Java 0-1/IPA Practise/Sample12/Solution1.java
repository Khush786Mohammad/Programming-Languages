import java.util.Scanner;

class Fruits{
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;

    public Fruits(int fruitId, String fruitName, int price, int rating){
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    public int getFruitId(){
        return this.fruitId;
    }
    public String getFruitName(){
        return this.fruitName;
    }
    public int getPrice(){
        return this.price;
    }
    public int getRating(){
        return this.rating;
    }
}

public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Fruits[] arr = new Fruits[4];
        for(int i = 0 ; i<4 ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            int rating = sc.nextInt();
            sc.nextLine();

            arr[i] = new Fruits(id, name, price, rating);
        }

        int rating = sc.nextInt();
        Fruits obj = findMaximumPriceByRating(arr, rating);
        if(obj != null){
            System.out.println(obj.getFruitId());
        }
        else{
            System.out.println("No such Fruit");
        }
    }

    public static Fruits findMaximumPriceByRating(Fruits[] arr, int rating){
        int maxi = Integer.MIN_VALUE;
        Fruits ans = null;

        for(Fruits f : arr){
            if(f.getRating() > rating && f.getPrice() > maxi){
                maxi = f.getPrice();
                ans = f;
            }
        }
        return ans;
    }
}