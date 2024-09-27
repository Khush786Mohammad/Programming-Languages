class Area
{
    int side;
    int len;
    int bre;
    double l;
    double b;

   int Area1(int a)
    {
        return a*a;
    }
    int Area1(int len , int bre)
    {
        return len * bre;
    }
    double Area1(double l , double b)
    {
         return (0.5*l*b);
    }
    
};

public class nine
{
    public static void main(String[] args)
    {
        Area a = new Area();
        System.out.println("Area of Cube="+a.Area1(10));
        System.out.println("Area of rectangle="+a.Area1(10,20));
        System.out.println("Area of Triangle = "+a.Area1(25.5 , 30.0));

    }
}