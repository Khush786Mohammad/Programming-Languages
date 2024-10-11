import java.util.*;
public class Hash_Map {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(14, "Khush");
        map.put(1,"Arradeem");
        map.put(16,"Lawrech");
        map.put(21,"Manya");
        map.put(21,"sana");

        System.out.println("Map size is " +map.size());
        System.out.println(map.get(14));

        for(Integer vals : map.keySet()){
            System.out.println(vals);
        }
        System.out.println();

        for(String vals : map.values()){
            System.out.println(vals);
        }
        System.out.println();

        for(Integer i : map.keySet()){
            System.out.println(i +" : "+map.get(i));
        }
        System.out.println();

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key +" : "+ value);
        }
    }
}
