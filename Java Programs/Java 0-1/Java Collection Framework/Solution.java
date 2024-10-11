// import java.util.*;
// class Document implements Comparable<Document>{
//     public int id;
//     public String title;
//     public String folderName;
//     public int pages;

//     public Document(int id , String title, String folderName, int pages){
//         this.id = id;
//         this.title = title;
//         this.folderName = folderName;
//         this.pages = pages;
//     }

//     @Override
//     public int compareTo(Document other){
//         return Integer.compare(this.id, other.id);
//     }

//     public int getId(){
//         return this.id;
//     }
//     public String getTitle(){
//         return this.title;
//     }
//     public String getFolderName(){
//         return this.folderName;
//     }
//     public int getPages(){
//         return this.pages;
//     }
// }
// public class Solution {
//     public static void main(String[] args){

//         Document[] newArray = new Document[4];

//         Scanner sc = new Scanner(System.in);
//         for(int i = 0 ; i<4 ; i++){

//             int id = sc.nextInt();
//             sc.nextLine();
//             String title = sc.nextLine();
//             String folderName = sc.nextLine();
//             int pages = sc.nextInt();

//             Document obj = new Document(id, title, folderName, pages);
//             newArray[i] = obj;
//         }

//         Document[] ans = docsWithOddPages(newArray);
//         Arrays.sort(ans);
//         int size = ans.length;

//         for(int i = 0 ; i<size ; i++){
//             System.out.println(ans[i].id+" "+ans[i].title+" "+ans[i].folderName+" "+ans[i].pages);
//         }
//         sc.close();
//     }
//     public static Document[] docsWithOddPages(Document[] newArray){
//         int count = 0;
//         for(int i = 0 ; i<4 ; i++){
//             if(newArray[i].pages % 2 != 0)
//             count++;
//         }
//         Document[] finalAns = new Document[count];
//         int idx = 0;
//         for(int i = 0 ; i<4 ; i++){
//             if(newArray[i].pages % 2 != 0){
//                 finalAns[idx] = newArray[i];
//                 idx++;
//             }
//         }
//         return finalAns;
//     }
// }

import java.util.*;

class Book{
    public int id;
    public String title;
    public String author;
    public double price;
    
    public Book(int id ,String title, String author, double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // @Override
    // public int compareTo(Book other){
    //     return Double.compare(this.price,other.price);
    // }
}
public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Book[] booksArray = new Book[4];
        for(int i = 0 ; i<4 ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            
            Book book = new Book(id,title,author,price);
            booksArray[i] = book;
        }
        
        sortBooksByPrice(booksArray);
        
        for(int i = 0 ; i<4 ; i++){
            System.out.println(booksArray[i].id +" "+booksArray[i].title +" "+booksArray[i].author +" "+booksArray[i].price);
        }
    }
    
    public static void sortBooksByPrice(Book[] booksArray){
        //selection sort

        for(int i = 0 ; i<4 ; i++){
            int mini = i;
            for(int j = i+1 ; j<4 ; j++){
                if(booksArray[j].price < booksArray[mini].price){
                    mini = j;
                }
            }
            if(i != mini){
                Book temp = booksArray[mini];
                booksArray[mini] = booksArray[i];
                booksArray[i] = temp; 
            }
        }
    }
}