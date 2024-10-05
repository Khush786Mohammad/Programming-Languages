import java.io.FileNotFoundException;
import java.text.ParseException;

class Machine{
    public void start(boolean throwParseException) throws ParseException, FileNotFoundException {

        if(throwParseException){
            throw new ParseException("Parsing is not done properly",2);
        }
        else
        
        throw new FileNotFoundException("File not found");
    }
}
public class HandlingMultiException {
    public static void main(String[] args){
        Machine mach1 = new Machine();
        try{
            mach1.start(false);
        }
        catch(ParseException p){
            System.out.println("Couldn't parse file");
        }
        catch(FileNotFoundException notF){
            System.out.println("File not found");
        }
    }
}
