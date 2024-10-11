import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting_List {
    public static void main(String[] args){
        // adding a reverse comparator
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(8);
        list.add(49);
        list.add(5);
        list.add(17);

        Collections.sort(list);

        for(Integer vals: list){
            System.out.println(vals);
        }

        List<String> animals = new ArrayList<String>();
        animals.add("Elephant");
        animals.add("Cow");
        animals.add("Peacock");
        animals.add("Monkey");
        animals.add("Dinasours");
        animals.add("Antilope");

        for(String anim : animals){
            System.out.println(anim);
        }

        Collections.sort(animals);

        System.out.println("\nAfter Lexographically Sorting\n");

        for(String anim : animals){
            System.out.println(anim);
        }

    }
}
