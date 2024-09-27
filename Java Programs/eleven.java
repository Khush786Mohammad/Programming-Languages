class circle
{
    final double pi = 3.14;
    final int radius = 5;

    double circumference()
    {
            return 2*pi*radius;
    }
    double area()
    {
        return pi*radius*radius;
    }
}
public class eleven
{
    public static void main(String[] args)
    {
    circle cir = new circle();
    System.out.println("Circumference = "+cir.circumference());
    System.out.println("Area = "+cir.area());
    }
}