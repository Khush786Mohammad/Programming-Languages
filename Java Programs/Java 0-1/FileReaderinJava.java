import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileReaderinJava {
    public static void main(String[] args){
        File file = new File("test.txt");
        try {
            FileReader fr = new FileReader(file);
            try {
                BufferedReader br = new BufferedReader(fr);

                String line;
                while((line = br.readLine()) != null)
                {
                    System.out.println(line);
                }
            } catch (Exception e) {
                System.out.println("Unable to read the file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        finally{
            System.out.println("End of program");
        }
    }
}
