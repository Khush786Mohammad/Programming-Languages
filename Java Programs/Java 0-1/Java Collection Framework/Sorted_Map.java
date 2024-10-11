import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Sorted_Map {
    public static void main(String[] args){
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();

        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer,String> map){
        map.put(2,"Two");
        map.put(5,"Five");
        map.put(10,"Ten");
        map.put(9,"Nine");
        map.put(3,"Three");
        map.put(7,"Seven");
    
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key +" : "+value);
        }
        System.out.println();
    }
}
