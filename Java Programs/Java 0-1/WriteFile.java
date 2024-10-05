import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class WriteFile {
    public static void main(String[] args){
        File file = new File("writing.txt");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("Hello HOw are your");
            bw.newLine();
            bw.write("father");
            bw.close();
        }
        catch(IOException e){
            System.out.println("File not fould");
            e.printStackTrace();
        }
    }
}
