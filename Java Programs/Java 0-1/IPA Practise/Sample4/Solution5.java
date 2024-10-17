import java.util.Scanner;

class Footwear{
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear(int footwearId, String footwearName, String footwearType, int price){
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public int getFootwearId(){
        return this.footwearId;
    }
    public String getFootwearName(){
        return this.footwearName;
    }
    public String getFootwearType(){
        return this.footwearType;
    }
    public int getPrice(){
        return this.price;
    }
}

public class Solution5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of footwear objects");
        int size = sc.nextInt();
        sc.nextLine();

        Footwear[] footwears = new Footwear[size];

        for(int i = 0 ; i<size ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String footwearName = sc.nextLine();
            String footwearType = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            
            footwears[i] = new Footwear(id, footwearName, footwearType, price);

        }

        System.out.println("Enter the type of footwear to search: ");
        String searchFootwearType = sc.nextLine();
        System.out.println("Enter inputFootwearName: ");
        String inputFootwearName = sc.nextLine();

        int count = getCountByType(footwears, searchFootwearType);
        Footwear secondMaximum = getSecondHighestPriceByBrand(footwears, inputFootwearName);

        if(count != 0){
            System.out.println(count);
        }
        else{
            System.out.println("Footwear not available");
        }

        if(secondMaximum != null){
            System.out.println(secondMaximum.getPrice());
        }
        else{
            System.out.println("Brand not available");
        }

        sc.close();
    }

    public static int getCountByType(Footwear[] footwears, String fType){
        int count = 0;
        for(Footwear ft : footwears){
            if(ft.getFootwearType().equalsIgnoreCase(fType)){
                count++;
            }
        }
        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String fName){
        int maxi = Integer.MIN_VALUE;
        int secondMaxi = Integer.MAX_VALUE;
        Footwear maxiObj = null;
        Footwear secondMaxiObj = null;

        for(Footwear ft: footwears){
            if(ft.getFootwearName().equalsIgnoreCase(fName)){
                int price = ft.getPrice();
                if(price > maxi){
                    secondMaxi = maxi;
                    secondMaxiObj = maxiObj;

                    maxi = price;
                    maxiObj = ft;
                }
                else if(secondMaxi < price && price != maxi){
                    secondMaxi = price;
                    secondMaxiObj = ft;
                }
            }
        }
        return secondMaxiObj;
    }
}
