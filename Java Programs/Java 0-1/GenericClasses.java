class Pair<K, V>{
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return this.value;
    }
}

public class GenericClasses {
    public static void main(String[] args){
        Pair<Integer,Integer> object = new Pair<Integer,Integer>(10,20);
        System.out.println(object.getKey());
        System.out.println(object.getValue());

        Pair<Character,Integer> object2 = new Pair<Character,Integer>('a',65);
        System.out.println(object2.getKey());
        System.out.println(object2.getValue());

    }
}
