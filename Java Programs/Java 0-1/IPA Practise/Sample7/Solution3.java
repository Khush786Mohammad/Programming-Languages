import java.util.*;

class Book{
    private int id;
    private int pages;
    private String title;
    private String author;
    private double price;

    public Book(int id , int pages, String title, String author, double price){
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId(){
        return this.id;
    }
    public int getPages(){
        return this.pages;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
}

public class Solution3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            int pages = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            books[i] = new Book(id, pages, title, author, price);
        }

        String searchTitle = sc.nextLine();
        Book obj = findBookWithMaximumPrice(books);
        Book[] ans = searchBookByTitle(books, searchTitle);

        if(obj != null){
            System.out.println(obj.getId() + " "+obj.getTitle());
        }
        else{
            System.out.println("No Book found with mentioned attribute.");
        }

        if(ans.length > 0){
            for(Book bk: ans){
                System.out.println(bk.getId() + " "+bk.getTitle());
            }
        }
        else{
            System.out.println("No Book found with mentioned attribute.");
        }
        sc.close();
    }

    public static Book findBookWithMaximumPrice(Book[] books){
        double maxi = Integer.MIN_VALUE;
        Book ans = null;

        for(Book bk : books){
            if(bk.getPrice() > maxi){
                maxi = bk.getPrice();
                ans = bk;
            }
        }
        return ans;
    }

    public static Book[] searchBookByTitle(Book[] books, String sBook){
        Book[] ans = new Book[0];
        for(Book bk : books){
            if(bk.getTitle().equalsIgnoreCase(sBook)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = bk;
            }
        }
        return ans;
    }
}
