import java.util.*;

class Movie{
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie(String movieName, String company, String genre, int budget){
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName(){
        return this.movieName;
    }
    public String getCompany(){
        return this.company;
    }
    public String getGenre(){
        return this.genre;
    }
    public int getBudget(){
        return this.budget;
    }
}

public class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Movie[] movies = new Movie[n];

        for(int i = 0 ; i<n ; i++){
            String name = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();
            sc.nextLine();

            movies[i] = new Movie(name, company, genre, budget);
        }

        String searchGenre = sc.nextLine();
        Movie[] ans = getMovieByGenre(movies, searchGenre);

        if(ans.length > 0){
            for(Movie mv : ans){
                if(mv.getBudget() > 80000000){
                    System.out.println("High Budget Movie");
                }
                else{
                    System.out.println("Low Budget Movie");
                }
            }
        }
        else{
            System.out.println("No Movie Found");
        }
    }

    public static Movie[] getMovieByGenre(Movie[] movies, String sGenre){
        Movie[] ans = new Movie[0];
        for(Movie mv : movies){
            if(mv.getGenre().equalsIgnoreCase(sGenre)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = mv;
            }
        }
        return ans;
    }
}