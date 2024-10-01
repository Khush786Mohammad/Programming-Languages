import java.lang.StringBuilder;
public class String_Builder {
    public static void main(String[] args){
        String str = new String("Khush Mohammad");
        str += "B.tech";
        System.out.println(str);
        
        StringBuilder sb = new StringBuilder();
        sb.append("Khush Mohammad");

        System.out.println(sb);

        sb.append(" graduation from Graphic Era").append(" in the year 2024");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder('A');
        sb2.append('b').append('c');
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder(10);
        sb3.append("StringBuilder");
        System.out.println(sb3);

        System.out.println(sb2.capacity());
        System.out.println(sb3.charAt(4));

        sb3.deleteCharAt(4);
        System.out.println(sb3.toString());
        sb3.delete(1,4);
        System.out.println(sb3);

        sb3.append("BoB");
        System.out.println(sb3.indexOf("Bo"));
        System.out.println(sb3);
        System.out.println(sb3.lastIndexOf("B"));
        System.out.println(sb3.reverse());

        sb3.setCharAt(2,'t');
        System.out.println(sb3);

        sb3.insert(6,"BULL");
        System.out.println(sb3);

        System.out.println(sb3.subSequence(2, 6));
        System.out.println(sb3.substring(2,6));
        String newStr = sb3.substring(3);
        System.out.println(newStr);


    }
}
