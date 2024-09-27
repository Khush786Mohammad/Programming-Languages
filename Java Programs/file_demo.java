//create a file hello.txt and display the information about the file.

import java.io.*;
public class file_demo
{
    public static void main(String[] args)
    {
        File f1 = new File("D:Hello.txt");
        try{

        
        if(f1.createNewFile())
        {
            System.out.println("File is successfully created");
        }
        else
        {
            System.out.println("File is already exit");
        }
    }
    catch(Exception e)
    {
        System.out.println("Kych bhi");
    }
    }
}