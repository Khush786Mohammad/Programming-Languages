import java.io.*;

public class file_demo2
{
public static void main(String[] args)
{
    try{
        
        FileWriter f1 = new FileWriter("Khush.txt");
        f1.write("Hello khush file handing is todays topic of java");
        f1.close();
    }
    catch(Exception s)
    {
        System.out.println("Exception aa gaya h bhai");
    }
    
}
}