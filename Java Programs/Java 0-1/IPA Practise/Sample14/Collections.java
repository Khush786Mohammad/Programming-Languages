import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class Collections {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(10);
        set1.add(20);
        set1.add(10);

        for(Integer st: set1){
            System.out.println(st);
        }

        if(set1.contains(20))
        System.out.println("true");
        else{
            System.out.println("false");
        }

        System.out.println(set1.size());

        // map

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Khush");
        map.put(2,"Mohammad");
        map.put(3,"Coco");

        //traversing on keys

        for(Integer keys: map.keySet()){
            System.out.println(keys +" "+ map.get(keys));
        }

        // for(String vals: map.values()){
        //     System.out.println(vals);
        // }

        for(Map.Entry<Integer,String> entries: map.entrySet()){
            Integer key = entries.getKey();
            String value = entries.getValue();

            System.out.println(key +" "+value);
        }
    }
}
