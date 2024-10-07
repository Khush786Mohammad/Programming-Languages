import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Linked_List {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        LinkedList<Integer> myList = new LinkedList<Integer>();

        myList.add(10);
        myList.add(20);

        myList.add(30);
        myList.add(40);
        myList.add(50);

        myList.add(60);
        myList.add(70);

        myList.remove();
        myList.add(3,33);
        myList.remove(5);

        for(Integer vals: myList){
            System.out.println(vals);
        }
        System.out.println();

        myList.remove();
        myList.addFirst(10);
        myList.addLast(100);

        for(Integer vals: myList){
            System.out.println(vals);
        }

        myList.removeFirst();
        myList.removeLast();
        System.out.println();


        for(Integer vals: myList){
            System.out.println(vals);
        }

        System.out.println(myList.getFirst()  +" " +myList.getLast());
        System.out.println(myList.peek());
        System.out.println(myList.peekLast());

        calculateTiming("ArrayList",arrayList);
        calculateTiming("LinkedList", linkedList);
    }

    public static void calculateTiming(String type , List<Integer> list){
        for(int i = 0 ; i<1E5 ; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();
        
        //insertion at the begining

        // for(int i = 0 ; i<1E5 ; i++){
        //     list.add(0,i);
        // }

        //insertion at the middle

        // for(int i = 0 ; i<1E5 ; i++){
        //     list.add(100,i);
        // }

        //insertion at the end
         for(int i = 0 ; i<1E5 ; i++){
                list.add(list.size()-1,i);
            }

        long end = System.currentTimeMillis();
        System.out.println("Total Time taken for " +type +": " + (end-start));
    }
}
