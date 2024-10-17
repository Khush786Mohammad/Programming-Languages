import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class College{
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pincode;

    public College(int id , String name , int contactNo, String address, int pinCode){
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pincode = pinCode;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getContactNo(){
        return this.contactNo;
    }
    public String getAddress(){
        return this.address;
    }
    public int getPinCode(){
        return this.pincode;
    }
}

public class Solution3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of college: ");
        int n = sc.nextInt();
        sc.nextLine();

        College[] college = new College[n];

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int cNo = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            int pCode = sc.nextInt();
            sc.nextLine();

            college[i] = new College(id, name, cNo, address, pCode);

        }       
        
        System.out.println("Enter the address to search for college");
        String searchAddr = sc.nextLine();
        
        College obj = findCollegeWithMaximumPincode(college);
        List<College> clgAddr = searchCollegeByAddress(college, searchAddr);

        if(obj != null){
            System.out.println(obj.getPinCode());
        }
        else{
            System.out.println("No college found with meantion attribute");
        }

        if(!clgAddr.isEmpty()){
            for(College clg : clgAddr){
                System.out.println(" Id-"+clg.getId()+" name-"+clg.getName()+" contactNo-"+clg.getContactNo()+" address-"+clg.getAddress()+" pincode-"+clg.getPinCode());
            }
        }
        else{
            System.out.println("No college found with meantion attribute");
        }
        sc.close();
    }

    public static College findCollegeWithMaximumPincode(College[] college){
        int maxi = Integer.MIN_VALUE;
        College obj = null;

        for(College clg : college){
            if(clg.getPinCode() > maxi){
                maxi = clg.getPinCode();
                obj = clg;
            }
        }
        return obj;
    }

    public static List<College> searchCollegeByAddress(College[] college, String sAdd){
        List<College> list = new ArrayList<College>();

        for(College clg : college){
            if(clg.getAddress().equalsIgnoreCase(sAdd)){
                list.add(clg);
            }
        }
        return list;
    }
}
