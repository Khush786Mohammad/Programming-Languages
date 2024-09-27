import java.util.*;
class rectangle
{
    int len;
    int bre;

    rectangle(int l , int b)
    {
        this.len = l;
        this.bre = b;
    }
    int cal()
    {
        return len*bre;
    }
};
public class fifth
{
    public static void main(String[] args)
    {
        rectangle r = new rectangle(10 , 20);
        System.out.println("Area of rectangle= "+r.cal());
    }
}