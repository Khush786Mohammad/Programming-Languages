import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cinema{
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Cinema(int movieId, String director, int rating, int budget){
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId(){
        return this.movieId;
    }
    public String getDirector(){
        return this.director;
    }
    public int getRating(){
        return this.rating;
    }
    public int getBudget(){
        return this.budget;
    }
}

public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<Cinema> cinema = new ArrayList<>();

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String director = sc.nextLine();
            int rating = sc.nextInt();
            sc.nextLine();
            int budget = sc.nextInt();
            sc.nextLine();

            cinema.add(new Cinema(id, director, rating, budget));
        }

        String director = sc.nextLine();
        int rating = sc.nextInt();
        sc.nextLine();
        int budget = sc.nextInt();

        int total = findAvgBudgetByDirector(cinema, director);

        Cinema ans = null;
        if(budget % rating == 0)
        ans = getMovieByRatingBudget(cinema, rating, budget);

        if(total != 0){
            System.out.println(total);
        }
        else{
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        if(ans != null){
            System.out.println(ans.getMovieId());
        }
        else{
            System.out.println("No movie is available with the specified rating and budget requirement");
        }
    }

    public static int findAvgBudgetByDirector(List<Cinema> cinema, String director){
        int total = 0;
        int n = 0;

        for(Cinema c : cinema){
            if(c.getDirector().equalsIgnoreCase(director)){
                total += c.getBudget();
                n++;
            }
        }
        if(n != 0)
        return total/n;
        return 0;
    }

    public static Cinema getMovieByRatingBudget(List<Cinema> cinema, int rating, int budget){
        for(Cinema c: cinema){
            if(c.getRating() == rating && c.getBudget() == budget){
                return c;
            }
        }
        return null;
    }
}
