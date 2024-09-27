//Count no. of object created using static method

public class count
{
    private static int cnt;
    count()
    {
        cnt++;
    }
    public static void main(String args[])
    {
        count c1 = new count();
        count c2 = new count();
        count c3 = new count();
        count c4 = new count();

        System.out.println("NO. of objects created = "+count.cnt);
    }
}