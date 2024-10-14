import java.util.Map;
import java.util.HashMap;

public class Mapss{
    public static void main(String[] args){
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();

        mp.put(2,4);
        mp.put(9,81);
        mp.put(5,25);
        mp.put(10,100);
        mp.put(3,9);

        for(Integer vals : mp.values()){
            System.out.println(vals);
        }

        System.out.println("------------------\n");
        
        for(Map.Entry<Integer,Integer> m : mp.entrySet()){
            System.out.println(m.getKey()+"Square values is: "+m.getValue());
        }
    }
}
