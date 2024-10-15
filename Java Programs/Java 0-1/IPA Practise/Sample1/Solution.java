import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Medicine{
    private String medName;
    private String batchNo;
    private String disease;
    private int price;

    public Medicine(String medName, String batchNo, String disease, int price){
        this.medName = medName;
        this.batchNo = batchNo;
        this.disease = disease;
        this.price = price;
    }

    // getter
    public String getMedicineName(){
        return this.medName;
    }
    public String getBatchNo(){
        return this.batchNo;
    }
    public String getDisease(){
        return this.disease;
    }
    public int getPrice(){
        return this.price;
    }
}


public class Solution{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String diseaseType = "FEVER";
        Medicine[] medArray = new Medicine[8];

        medArray[0] = new Medicine("Thyrox", "f250", "Thyroid", 258);
        medArray[1] = new Medicine("Paracetemol","B2o8","fever",120);
        medArray[2] = new Medicine("Anti-Thyrox","24F0","THYROID",470);
        medArray[3] = new Medicine("DengiFree","TT90","fever",690);
        medArray[4] = new Medicine("Carbimazole","G90","thyroid",788);
        medArray[5] = new Medicine("Gastro Relief","GG290s","Bloating",44);
        medArray[6] = new Medicine("Peptard-D","PP-D20","Bloating",123);
        medArray[7] = new Medicine("Hypo Fever","F209","FEVER",87);

        List<Integer> prices = medicinePriceForGivenDisease(diseaseType, medArray);

        Collections.sort(prices);
        for(Integer vals: prices){
            System.out.println(vals);
        }
        // Close the scanner
        sc.close();
   }

   public static List<Integer> medicinePriceForGivenDisease(String disease, Medicine[] medArray){
    //if creating array
    /*
     * int[] ans = new int[0];
     * ans = Arrays.copyOf(ans, ans.length+1);
     */
        List<Integer> list = new ArrayList<Integer>();

        for(Medicine medObj : medArray){
            String diseaseType = medObj.getDisease();


            if(disease.compareToIgnoreCase(diseaseType) == 0){ // cans use (disease.equalsIgnoreCase(diseaseType))
                list.add(medObj.getPrice());
            }
        }
        return list;
   }
}