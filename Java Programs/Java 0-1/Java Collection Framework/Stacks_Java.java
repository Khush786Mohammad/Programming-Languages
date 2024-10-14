import java.util.Stack;
import java.util.Iterator;
public class Stacks_Java {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);

        System.out.println(st.size() + " " +st.peek());
        st.pop();
        System.out.println(st.peek());

        st.push(10);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);

        for(Integer sta: st){
            System.out.println(sta);
        }

        System.out.println(st.empty());
        System.out.println(st.isEmpty());

        System.out.println("-----------\n");

        Iterator<Integer> itr = st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----------\n");


        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
