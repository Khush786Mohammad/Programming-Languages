import java.util.*;
public class arrays{
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 33;
        numbers[3] = 69;
        numbers[4] = 50;

        System.out.println("Size of array is " + numbers.length);
        System.out.println("First and Last number of arrays are " + numbers[0] + " " + numbers[4]);

        String[] languages = {"C++", "C", "JavaScript", "Java"};
        for(int i = 0 ; i<languages.length ; i++)
        {
            System.out.println("Language " + i + " " + languages[i]);
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}