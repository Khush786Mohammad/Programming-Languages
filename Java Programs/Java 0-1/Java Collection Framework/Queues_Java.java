import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
public class Queues_Java {
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<Integer>();

        que.add(10);
        que.add(20);

        System.out.println(que.size() + " " + que.element());
        System.out.println(que.remove());

        que.add(101);
        que.add(55);
        que.add(98);
        que.add(77);
        que.add(665);

        //iterator
        System.out.println("------------\n");
        Iterator<Integer> itr = que.iterator();

        while(itr.hasNext()){
            int value = itr.next();
            System.out.println(value);
        }

    }
}
