import java.util.Arrays;
import java.util.Scanner;

class Player{
    private int playerId;
    private String skill;
    private String level;
    private int points;

    public Player(int playerId, String skill, String level, int points){
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    public int getPlayerId(){
        return this.playerId;
    }
    public String getSkill(){
        return this.skill;
    }
    public String getLevel(){
        return this.level;
    }
    public int getPoints(){
        return this.points;
    }
}

public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        for(int i = 0 ; i<n ; i++){
            int pId = sc.nextInt();
            sc.nextLine();
            String skills = sc.nextLine();
            String level = sc.nextLine();
            int points = sc.nextInt();
            sc.nextLine();

            players[i] = new Player(pId, skills, level, points);
        }

        String skills = sc.nextLine();
        String levels = sc.nextLine();
        int ans = findPointsForGivenSkill(players, skills);
        Player[] arr = getPlayerBasedOnLevel(players, skills, levels);

        if(ans != 0){
            System.out.println(ans);
        }
        else{
            System.out.println("The given Skill is not available");
        }

        if(arr.length != 0){
            for(Player pls: arr){
                System.out.println(pls.getPlayerId());
            }
        }
        else{
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
        sc.close();
    }

    public static int findPointsForGivenSkill(Player[] players, String skill){
        int total = 0;
        for(Player pls: players){
            if(pls.getSkill().compareToIgnoreCase(skill)==0){
                total += pls.getPoints();
            }
        }
        return total;
    }

    public static Player[] getPlayerBasedOnLevel(Player[] players, String skill, String levels){
        Player[] ans = new Player[0];

        for(Player pls: players){
            if(pls.getSkill().equalsIgnoreCase(skill) && pls.getLevel().equalsIgnoreCase(levels) && pls.getPoints() >= 20){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = pls;
            }
        }
        return ans;
    }
}