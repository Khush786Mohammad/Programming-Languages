class Multiplication{
    public static int Multiply(int a , int b){
        return a*b;
    }
    public static double Multiply(double a , double b){
        return a*b;
    }
    public static float Multiply(float a ,float b , float c){
        return a * b * c;
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args){
        System.out.println(Multiplication.Multiply(10,20));
        System.out.println(Multiplication.Multiply(2.5, 5.5));
        System.out.println(Multiplication.Multiply(10.1f, 20.4f, 30.1f));

        System.out.println(Multiplication.Multiply(10,20,30));
    }
}
