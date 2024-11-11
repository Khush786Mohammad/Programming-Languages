import java.util.Scanner;

class Newspaper{
    private int regNo;
    private String name;
    private int pubYear;
    private int price;

    public Newspaper(int regNo, String name, int pubYear, int price){
        this.regNo = regNo;
        this.name = name;
        this.pubYear = pubYear;
        this.price = price;
    }

    public int getRegNo(){
        return this.regNo;
    }
    public String getName(){
        return this.name;
    }
    public int getPubYear(){
        return this.pubYear;
    }
    public int getPrice(){
        return this.price;
    }

    public String toString(){
        return this.regNo+" "+this.name+" "+this.pubYear+" "+this.price;
    }
}

public class Solution6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Newspaper[] paper = new Newspaper[4];

        for(int i = 0 ; i<4 ; i++){
            int reg = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int year = sc.nextInt();
            sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            paper[i] = new Newspaper(reg, name, year, price);
        }

        int type = sc.nextInt();
        sc.nextLine();
        String sName = sc.nextLine();
        int total = findTotalPriceByPublicationYear(paper, type);
        Newspaper obj = searchNewspaperByName(paper, sName);

        if(total == 0){
            System.out.println("No Newspaper found with the mentioned attribute");
        }
        else
        System.out.println(total);
        if(obj != null){
            System.out.println(obj);
        }
        else{
            System.out.println("No Newspaper found with the given name.");
        }
    }

    public static int findTotalPriceByPublicationYear(Newspaper[] paper, int type){
        int total = 0;
        for(Newspaper n : paper){
            if(n.getPubYear() == type){
                total += n.getPrice();
            }
        }
        return total;
    }

    public static Newspaper searchNewspaperByName(Newspaper[] paper, String sName){
        for(Newspaper p : paper){
            if(p.getName().equalsIgnoreCase(sName)){
                return p;
            }
        }
        return null;
    }
}
