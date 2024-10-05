import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadingFiles {
    public static void main(String[] args){
        // String FileName = "textfile.txt";
        File textFile = new File("textfdile.txt");

        try{
            Scanner sc = new Scanner(textFile);

            while(sc.hasNextLine()){
                String line = sc.nextLine();

                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException f){
            System.out.println("Exception found " +f);
        }
    }
}
