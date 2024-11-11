import java.util.Scanner;

class Team{
    private int tId;
    private String tName;
    private String tCountry;
    private int tRun;

    public Team(int tId, String tName, String tCountry, int tRun){
        this.tId = tId;
        this.tName = tName;
        this.tCountry = tCountry;
        this.tRun = tRun;
    }

    public int get_tId(){
        return this.tId;
    }
    public String get_tName(){
        return this.tName;
    }
    public String get_tCountry(){
        return this.tCountry;
    }
    public int get_tRun(){
        return this.tRun;
    }

    public String toString(){
        return tId+" "+tName+" "+tCountry+" "+tRun;
    }
}
public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Team[] teams = new Team[n];

        for(int i = 0 ; i < n ; i++){
            int tId = sc.nextInt();
            sc.nextLine();
            String tName = sc.nextLine();
            String tCountry = sc.nextLine();
            int tRun = sc.nextInt();
            sc.nextLine();

            teams[i] = new Team(tId, tName, tCountry, tRun);
        }
        int searchRuns = sc.nextInt();
        sc.nextLine();
        String country = sc.nextLine();

        Team obj = findPlayer(teams, searchRuns, country);
        if(obj != null){
            System.out.println(obj);
        }
        else{
            System.out.println("No team available");
        }
    }

    public static Team findPlayer(Team[] teams, int sRuns, String country){
        Team ans = null;
        for(Team t: teams){
            if(t.get_tCountry().equalsIgnoreCase(country) && t.get_tRun() > sRuns){
                return t;
            }
        }
        return null;
    }
}