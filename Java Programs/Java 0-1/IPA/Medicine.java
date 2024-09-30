public class Medicine{
   String medicineName;
   String batchNo;
   String disease;
   int price; 

   public Medicine(String medicineName, String batchNo, String disease, int price){
    this.medicineName = medicineName;
    this.batchNo = batchNo;
    this.disease = disease;
    this.price = price;
   }

   //getter methods;
   public String getMedicineName(){
    return this.medicineName;
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