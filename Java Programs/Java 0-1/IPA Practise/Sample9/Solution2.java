import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;

class Medicine{
    private String medName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String medName, String batch, String disease, int price){
        this.medName = medName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedName(){
        return this.medName;
    }
    public String getBatch(){
        return this.batch;
    }
    public String getDisease(){
        return this.disease;
    }
    public int getPrice(){
        return this.price;
    }
}

public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Comparator<Integer> custome = (s1,s2) -> Integer.compare(s1,s2);
        int n = sc.nextInt();
        sc.nextLine();

        Medicine[] medicines = new Medicine[n];

        for(int i = 0 ; i<n ; i++){
            String name = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            medicines[i] = new Medicine(name, batch, disease, price);
        }

        String disease = sc.nextLine();

        List<Integer> list = getPriceByDisease(medicines, disease);
        Collections.sort(list, custome);

        if(!list.isEmpty()){
            for(Integer ls: list){
                System.out.println(ls);
            }
        }
        else{
            System.out.println("No results found");
        }
        sc.close();
    }

    public static List<Integer> getPriceByDisease(Medicine[] medicines, String disType){
        List<Integer> list = new ArrayList<Integer>();
        for(Medicine med : medicines){
            if(med.getDisease().compareToIgnoreCase(disType) == 0){
                list.add(med.getPrice());
            }
        }
        return list;
    }
}
