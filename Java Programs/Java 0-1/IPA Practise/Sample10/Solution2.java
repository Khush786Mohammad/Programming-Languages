import java.util.Scanner;

class Phone{
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId, String os, String brand, int price){
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId(){
        return this.phoneId;
    }
    public String getOs(){
        return this.os;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getPrice(){
        return this.price;
    }
}
public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Phone[] phones = new Phone[n];

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            phones[i] = new Phone(id, os, brand, price);
        }

        String sBrand = sc.nextLine();
        String sOs = sc.nextLine();

        int sum = findPriceForGivenBrand(phones, sBrand);
        Phone obj = getPhoneIdBasedOnOs(phones, sOs);

        if(sum != 0){
            System.out.println(sum);
        }
        else{
            System.out.println("The given Brand is not available");
        }

        if(obj != null){
            System.out.println(obj.getPhoneId());
        }
        else{
            System.out.println("No phones are available with specified os and price range");
        }
        sc.close();
    }
    public static int findPriceForGivenBrand(Phone[] phones, String sBrand){
        int total = 0;
        for(Phone ph: phones){
            if(ph.getBrand().equalsIgnoreCase(sBrand)){
                total += ph.getPrice();
            }
        }
        return total;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String searchOS){
        for(Phone ph: phones){
            if(ph.getOs().equalsIgnoreCase(searchOS) && ph.getPrice() >= 50000){
                return ph;
            }
        }
        return null;
    }
}
