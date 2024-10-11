import java.util.Set;
import java.util.LinkedHashSet;
public class Set_Collection {
    public static void main(String[] args){
        Set<Integer> set1 = new LinkedHashSet<Integer>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(20);
        set1.add(10);

        System.out.println(set1.size());
        for(Integer entries: set1){
            System.out.println(entries);
        }
        if(set1.contains(10)){
            System.out.println("10 is present");
            
        }
            System.out.println(set1.isEmpty());
            System.out.println(set1.contains(50));

            set1.remove(20);
            set1.add(50);

            System.out.println("Set1: ");
            for(Integer entries: set1){
                System.out.println(entries);
            }

            //intersection in set
            Set<Integer> set2 = new LinkedHashSet<Integer>();
            set2.add(10);
            set2.add(60);
            set2.add(50);
            set2.add(70);
            set2.add(100);

            System.out.println("Set2");

            for(Integer entries: set2){
                System.out.println(entries);
            }
            Set<Integer> intersectionSet = new LinkedHashSet<Integer>(set1);
            intersectionSet.retainAll(set2);

            System.out.println("Intersection of set1 and set2");

            for(Integer vals: intersectionSet){
                System.out.println(vals);
            }

            //difference of set1 and set2

            Set<Integer> differenceSet = new LinkedHashSet<Integer>(set1);

            differenceSet.removeAll(set2);

            System.out.println("Difference");

            for(Integer vals: differenceSet){
                System.out.println(vals);
            }
    }
}
