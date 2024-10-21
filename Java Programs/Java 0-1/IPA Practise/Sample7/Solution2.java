import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Hotel{
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dob , int nofRooms, String wifiFacility, double totalBill){
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dob;
        this.noOfRoomsBooked = nofRooms;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId(){
        return this.hotelId;
    }
    public String getHotelName(){
        return this.hotelName;
    }
    public String getDateOfBooking(){
        return this.dateOfBooking;
    }
    public int getNoOfRoomsBooked(){
        return this.noOfRoomsBooked;
    }
    public String getWifiFacility(){
        return this.wifiFacility;
    }
    public double getTotalBill(){
        return this.totalBill;
    }
}

public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<Hotel> list = new ArrayList<Hotel>();

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String hName = sc.nextLine();
            String dBooking = sc.nextLine();
            int nofRooms = sc.nextInt();
            sc.nextLine();
            String wifi = sc.nextLine();
            double bill = sc.nextDouble();
            sc.nextLine();

            list.add(new Hotel(id, hName, dBooking, nofRooms, wifi, bill));
        }

        String givenMonth = sc.nextLine();
        String searchWifiFacility = sc.nextLine();

        int cnt = noOfRoomsBookedInGivenMonth(list, givenMonth);
        Hotel ansObj = searchHotelByWifiOption(list, searchWifiFacility);

        if(cnt != 0){
            System.out.println(cnt);
        }
        else{
            System.out.println("No rooms booked in the given month");
        }

        if(ansObj != null){
            System.out.println(ansObj.getHotelId());
        }
        else{
            System.out.println("No such option available");
        }

        sc.close();
    }

    public static int noOfRoomsBookedInGivenMonth(List<Hotel> list, String givenMonth){
        int count = 0;
        for(Hotel hotels : list){
            String dateOfBooking = hotels.getDateOfBooking();
            String[] arr = dateOfBooking.split("-");
            String month = arr[1];
            if(month.equalsIgnoreCase(givenMonth)){
                count += hotels.getNoOfRoomsBooked();
            }
        }
        return count;
    }

    public static Hotel searchHotelByWifiOption(List<Hotel> hotels, String searchWifiFacility){
        double maxi = Integer.MIN_VALUE;
        Hotel maxiObj = null;

        double secondMaxi = Integer.MIN_VALUE;
        Hotel secondMaxiObj = null;

        for(Hotel list: hotels){
            if(list.getWifiFacility().equalsIgnoreCase(searchWifiFacility)){
                double bill = list.getTotalBill();
                if(bill > maxi){
                    secondMaxi = maxi;
                    secondMaxiObj = maxiObj;

                    maxi = bill;
                    maxiObj = list;
                }
                else if(bill > secondMaxi && bill != maxi){
                    secondMaxi = bill;
                    secondMaxiObj = list;
                }
            }
        }
        return secondMaxiObj;
    }
}
