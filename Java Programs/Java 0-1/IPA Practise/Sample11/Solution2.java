import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Antenna{
    private int antennaId;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    public Antenna(int antennaId, String antennaName, String projectLead, double antennaVSWR){
        this.antennaId = antennaId;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getId(){
        return antennaId;
    }
    public String getName(){
        return antennaName;
    }
    public String getProject(){
        return this.projectLead;
    }
    public double getVSWR(){
        return this.antennaVSWR;
    }
}

public class Solution2{
    public static void main(String[] args){
        Comparator<Antenna> custome = Comparator.comparingDouble(Antenna::getVSWR);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Antenna[] antennas = new Antenna[n];

        for(int i=0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String project = sc.nextLine();
            double vswr = sc.nextDouble();
            sc.nextLine();

            antennas[i] = new Antenna(id, name, project, vswr);
        }

        String searchAntennaName = sc.nextLine();
        double vswr = sc.nextDouble();

        int id = searchAntennaByName(antennas, searchAntennaName);
        Antenna[] ans = sortAntennaByVSWR(antennas,vswr);
        Arrays.sort(ans, custome);

        if(id > 0){
            System.out.println(id);
        }
        else{
            System.out.println("There is no antenna with the given parameter");
        }

        if(ans.length > 0){
            for(Antenna an : ans){
                System.out.println(an.getProject());
            }
        }else{
            System.out.println("No Antenna found");
        }
    }
    public static int searchAntennaByName(Antenna[] antennas, String searchAN){
        for(Antenna an : antennas){
            if(an.getName().equalsIgnoreCase(searchAN)){
                return an.getId();
            }
        }
        return 0;
    }

    public static Antenna[] sortAntennaByVSWR(Antenna[] antennas, double vswr){
        Antenna[] ans = new Antenna[0];
        for(Antenna an: antennas){
            if(an.getVSWR() < vswr){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = an;
            }
        }
        return ans;
    }
}