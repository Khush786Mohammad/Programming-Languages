import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class NavalVessel implements Cloneable{
    private int vesselld;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;

    public NavalVessel(int vesselld, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose){
        this.vesselld = vesselld;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    public void setClassification(String classification){
        this.classification = classification;
    }

    public String getClassification(){
        return this.classification;
    }

    public int getVesselld(){
        return this.vesselld;
    }
    public String getVesselName(){
        return this.vesselName;
    }
    public int getNoOfVoyagesPlanned(){
        return this.noOfVoyagesPlanned;
    }
    public int getNoOfVoyagesCompleted(){
        return this.noOfVoyagesCompleted;
    }
    public String getPurpose(){
        return this.purpose;
    }

    @Override 
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Solution3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<NavalVessel> navalList = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int planned = sc.nextInt();
            sc.nextLine();
            int completed = sc.nextInt();
            sc.nextLine();
            String purpose = sc.nextLine();

            navalList.add(new NavalVessel(id, name, planned, completed, purpose));
        }

        int percentage = sc.nextInt();
        sc.nextLine();
        String purpose = sc.nextLine();

        int avg = findAvgVoyagesByPct(navalList, percentage);
        NavalVessel obj = findVesselByGrade(navalList, purpose);

        if(avg != 0){
            System.out.println(avg);
        }
        else{
            System.out.println("Criteria didn't match");
        }
        if(obj != null){
            System.out.println(obj.getVesselName()+"%"+obj.getClassification());
        }
        else{
            System.out.println("No Naval Vessel is available with the specified purpose");
        }

        // NavalVessel checkobj = navalList.get(2);
        // System.out.println(checkobj.getVesselName()+" "+checkobj.getClassification());
        sc.close();

    }

    public static int findAvgVoyagesByPct(List<NavalVessel> navalList, int percentage){
        int cnt = 0;
        int sum = 0;

        for(NavalVessel list: navalList){
            int planned = list.getNoOfVoyagesPlanned();
            int completed = list.getNoOfVoyagesCompleted();

            int calculatePer = (completed*100)/planned;
            if(calculatePer >= percentage){
                sum += completed;
                cnt++;
            }
        }
        return sum/cnt;
    }

    public static NavalVessel findVesselByGrade(List<NavalVessel> navalList, String sPurpose){
        for(NavalVessel list: navalList){
            if(list.getPurpose().equalsIgnoreCase(sPurpose)){
                int planned = list.getNoOfVoyagesPlanned();
                int completed = list.getNoOfVoyagesCompleted();

                int calculatePer = (completed*100)/planned;

                try{
                    NavalVessel ans = (NavalVessel) list.clone();
                    if(calculatePer == 100){
                        ans.setClassification("Start");
                    }
                    else if(calculatePer >= 99 && calculatePer <= 80){
                        ans.setClassification("Leader");
                    }
                    else if(calculatePer >= 79 && calculatePer <= 55){
                        ans.setClassification("Inspirer");
                    }
                    else{
                        ans.setClassification("Striver");
                    }
                    return ans;
                    }
                catch(CloneNotSupportedException e){

                }
            }
        }
        return null;
    }
}
