import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo(){
        return this.regNo;
    }
    public String getAgencyName(){
        return this.agencyName;
    }
    public String getPackageType(){
        return this.packageType;
    }
    public int getPrice(){
        return this.price;
    }
    public boolean isFlightFacility(){
        return this.flightFacility;
    }

    public String toString(){
        return this.agencyName+":"+this.price;
    }
}

public class Solution5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<TravelAgencies> agencies = new ArrayList<>();
        for(int i = 0 ; i<4 ; i++){
            int regNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            Boolean facility = sc.nextBoolean();
            sc.nextLine();

            agencies.add(new TravelAgencies(regNo, name, type, price, facility));
        }

        int sRegNo = sc.nextInt();
        sc.nextLine();
        String sPackType = sc.nextLine();

        int highest = findAgencyWithHighestPackagePrice(agencies);
        TravelAgencies obj = agencyDetailsForGivenldAndType(agencies, sRegNo, sPackType);

        System.out.println(highest);

        if(obj != null){
            System.out.println(obj);
        }
        else{
            System.out.println("Can't Find");
        }
    }

    public static int findAgencyWithHighestPackagePrice(List<TravelAgencies> list){
        int high = 0;

        for(TravelAgencies ta : list){
            int vals = ta.getPrice();
            if(vals > high){
                high = vals;
            }
        }
        return high;
    }

    public static TravelAgencies agencyDetailsForGivenldAndType(List<TravelAgencies> list, int sRegNo, String sPackType){

        for(TravelAgencies ta : list){
            if(ta.getRegNo() == sRegNo && ta.getPackageType().compareToIgnoreCase(sPackType) == 0){
                return ta;
            }
        }
        return null;
    }
}
