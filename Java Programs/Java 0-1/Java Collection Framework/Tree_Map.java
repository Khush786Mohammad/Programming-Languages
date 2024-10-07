import java.util.*;
public class Tree_Map{
    public static void main(String[] args){
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        

        treeMap.put(5,"Melon");
        treeMap.put(1,"Apple");
        treeMap.put(4,"Banana");
        treeMap.put(2,"Orange");
        treeMap.put(3,"WaterMelon");

        Comparator<Integer> reverseComparator = (s1,s2) -> s2.compareTo(s1);

        Map<Integer,String> reverseTreeMap = new TreeMap<Integer,String>(reverseComparator);

        reverseTreeMap.putAll(treeMap);

        for(Map.Entry<Integer,String> entry: treeMap.entrySet()){
            System.out.println(entry.getKey() +" : " +entry.getValue());
        }

        showMap(reverseTreeMap);
    }
    public static void showMap(Map<Integer,String> map){
        System.out.println();

        for(Map.Entry<Integer,String> entries: map.entrySet()){
            int key = entries.getKey();
            String values = entries.getValue();

            System.out.println(key +" : "+values);
        }
    }
}