import java.util.ArrayList;

public class Array_List{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3,100);

        System.out.println(list.isEmpty());

        for(int i = 0 ; i<list.size() ; i++){
            System.out.println(list.get(i));
        }

        for(Integer vals : list){
            System.out.println(vals*2);
        }

        //removing items from ArrayList
        list.remove(2);
        System.out.println(list.size());
    }
}