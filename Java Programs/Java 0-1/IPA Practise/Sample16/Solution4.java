import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Music{
    private int playListNo;
    private String type;
    private int count;
    private double duration;

    public Music(int playListNo, String type, int count, double duration){
        this.playListNo = playListNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }
    public int getPlayListNo(){
        return this.playListNo;
    }
    public String getType(){
        return this.type;
    }
    public int getCount(){
        return this.count;
    }
    public double getDuration(){
        return this.duration;
    }
}

class SortByDuration implements Comparator<Music>{
    @Override
    public int compare(Music obj1, Music obj2){
        return Double.compare(obj1.getDuration(), obj2.getDuration());
    }
}

public class Solution4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Music[] musics = new Music[4];
        for(int i = 0 ;i<4 ; i++){
            int list = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();
            int count = sc.nextInt();
            sc.nextLine();
            double duration = sc.nextDouble();
            sc.nextLine();

            musics[i] = new Music(list, type, count, duration);
        }
        int sCount = sc.nextInt();
        sc.nextLine();
        double sDuration = sc.nextDouble();
        int cnt = findAvgOfCount(musics, sCount);
        Music[] ans = sortTypeByDuration(musics,sDuration);

        if(cnt != 0){
            System.out.println(cnt);
        }
        else{
            System.out.println("No playlist found");
        }
        if(ans.length != 0){
            Arrays.sort(ans, new SortByDuration());
            for(Music m : ans){
                System.out.println(m.getType());
            }
        }
        else{
            System.out.println("No playlist found with mentioned attribute");
        }
    }

    public static int findAvgOfCount(Music[] musics, int sCount){
        int total = 0;
        int n = 0;

        for(Music m : musics){
            if(m.getCount() > sCount){
                total += m.getCount();
                n++;
            }
        }
        if(n != 0)
        return total/n;
        else
        return 0;
    }

    public static Music[] sortTypeByDuration(Music[] musics, double sDuration){
        Music[] ans = new Music[0];
        for(Music m: musics){
            if(m.getDuration() > sDuration){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = m;
            }
        }
        return ans;
    }
}
