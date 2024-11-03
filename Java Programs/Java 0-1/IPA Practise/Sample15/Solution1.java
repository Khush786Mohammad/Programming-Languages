import java.util.Scanner;
import java.util.regex.*;
import java.util.Arrays;

class Player{
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored){
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getRank(){
        return this.iccRank;
    }
    public int getMatchPlayed(){
        return this.matchesPlayed;
    }
    public int getRunsScored(){
        return this.runsScored;
    }
}

public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        for(int i = 0 ; i<4 ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int rank = sc.nextInt();
            sc.nextLine();
            int matchesPlayed = sc.nextInt();
            sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            
            players[i] = new Player(id, name, rank, matchesPlayed, runs);
        }
        int target = sc.nextInt();
        Player[] ans = findAverageOfRuns(players,target);

        if(ans != null){
            for(Player pls: ans){
                double avgRuns = pls.getRunsScored()/pls.getMatchPlayed();
                if(avgRuns >= 80 && avgRuns <= 100){
                    System.out.println("Grade A");
                }
                else if(avgRuns >= 50 && avgRuns <= 79){
                    System.out.println("Grade B");
                }
                else{
                    System.out.println("Grade C");
                }
            }
        }
        else{
            System.out.println("No Player Founnd");
        }
    }

    public static Player[] findAverageOfRuns(Player[] players, int target){
        Player[] ans = new Player[0];
        for(Player pls: players){
            if(target<=pls.getMatchPlayed()){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = pls;
            }
        }
        return ans;
    }
}