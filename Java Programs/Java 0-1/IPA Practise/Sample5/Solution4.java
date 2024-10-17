import java.util.Scanner;

class Motel{
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double bill){
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = bill;
    }

    public int getMotelId(){
        return this.motelId;
    }
    public String getMotelName(){
        return this.motelName;
    }
    public String getDOB(){
        return this.dateOfBooking;
    }
    public int getTotalRooms(){
        return this.noOfRoomsBooked;
    }
    public String getCabFacility(){
        return this.cabFacility;
    }
    public double getTotalBill(){
        return this.totalBill;
    }
}

public class Solution4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Motels");
        int n = sc.nextInt();
        sc.nextLine();

        Motel[] motels = new Motel[n];

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String date = sc.nextLine();
            int booksRoom = sc.nextInt();
            sc.nextLine();
            String cabFacility = sc.nextLine();
            double bill = sc.nextDouble();
            sc.nextLine();

            motels[i] = new Motel(id, name, date, booksRoom, cabFacility, bill);
        }

        System.out.println("Enter the cab Facility: ");
        String searchCabFacility = sc.nextLine();

        int ans = totalNoOfRoomsBooked(motels,searchCabFacility);
        
        if(ans != 0){
            System.out.println(ans);
        }
        else{
            System.out.println("No such rooms booked");
        }
        sc.close();
    }

    public static int totalNoOfRoomsBooked(Motel[] motels, String searchCF){
        int total = 0;
        for(Motel mt : motels){
            if(mt.getCabFacility().equalsIgnoreCase(searchCF) && mt.getTotalRooms() > 5){
                total += mt.getTotalRooms();
            }
        }
        return total;
    }
}
