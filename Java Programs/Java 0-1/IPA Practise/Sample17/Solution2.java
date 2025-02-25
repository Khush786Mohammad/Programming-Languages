import java.util.Scanner;

class Resort{
    private int resortId;
    private String resortName;
    private String category;
    private double resortPrice;
    private double resortRating;

    public Resort(int resortId, String resortName, String category, double resortPrice, double resortRating){
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
    }

    public int getResortId(){
        return this.resortId;
    }

    public String getResortName(){
        return this.resortName;
    }

    public String getCategory(){
        return this.category;
    }

    public double getResortPrice(){
        return this.resortPrice;
    }

    public double getResortRating(){
        return this.resortRating;
    }
}


public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Resort[] resort = new Resort[n];

        for(int i = 0 ; i<n ; i++){
            int resortid = sc.nextInt();
            sc.nextLine();
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double resortPrice = sc.nextDouble();
            sc.nextLine();
            double resortRating = sc.nextDouble();
            sc.nextLine();

            resort[i] = new Resort(resortid, resortName, category, resortPrice, resortRating);
        }

        String searchCategory = sc.nextLine();

        double ans = findAvgPrice(resort, searchCategory);

        if(ans != 0)
        {
            int ANS = (int)ans;
            System.out.println(ANS);
        }
        else
        System.out.print("No such Resort found");

        sc.close();
    }

    public static double findAvgPrice(Resort[] resort, String searchCategory){
        int cnt = 0;
        int total = 0;

        for(Resort obj: resort){
            if(obj.getCategory().equalsIgnoreCase(searchCategory)){
                total += obj.getResortPrice();
                cnt++;
            }
        }

        if(cnt != 0)
        return (double)((total*1.0)/cnt*1.0);
        return 0.0;
    }
}
