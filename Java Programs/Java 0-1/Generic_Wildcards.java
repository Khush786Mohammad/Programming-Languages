import java.util.*;
class Machine{
    public String toString(){
        return "I am a Machine";
    }
}
class Camera extends Machine{
    @Override
    public String toString(){
        return "I am a Camera";
    }
}
public class Generic_Wildcards {
    public static void main(String[] args){
        ArrayList<Machine> list = new ArrayList<Machine>();
        list.add(new Machine());
        list.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<Camera>();
        list.add(new Camera());
        list.add(new Camera());

        showList(list);
        // showList2(list2);
        showList(list2);
    }

    public static void showList(ArrayList<?> list){
        for(Object values : list){
            System.out.println(values);
        }
    }

    // public static void showList2(ArrayList<Camera> list){
    //     for(Camera values : list){
    //         System.out.println(values);
    //     }
    // }
}
