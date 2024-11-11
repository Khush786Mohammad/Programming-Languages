import java.util.Scanner;
import java.util.Arrays;

class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages){
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String folderName(){
        return this.folderName;
    }
    public int getPages(){
        return this.pages;
    }

    public String toString(){
        return this.id +" "+this.title+" "+this.folderName+" "+this.pages; 
    }
}

public class Solution3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Document[] documents = new Document[4];

        for(int i = 0 ; i<4 ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String folder = sc.nextLine();
            int pages = sc.nextInt();

            documents[i] = new Document(id, title, folder, pages);
        }

        Document[] ans = docsWithOddPages(documents);
        if(ans.length != 0){
            for(Document val : ans){
                System.out.println(val);
            }
        }
        else{
            System.out.println("No");
        }
    }

    public static Document[] docsWithOddPages(Document[] documents){
        Document[] ans = new Document[0];

        for(Document doc: documents){
            if(doc.getPages() % 2 != 0){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = doc;
            }
        }

        // sort 

        for(int i = 0 ; i<ans.length ; i++){
            int mini = i;
            for(int j = i+1; j<ans.length ; j++){
                if(ans[j].getId() < ans[mini].getId()){
                    mini = j;
                }
            }
            if(mini != i){
                Document temp = ans[i];
                ans[i] = ans[mini];
                ans[mini] = temp;
            }
        }
        return ans;
    }
}
