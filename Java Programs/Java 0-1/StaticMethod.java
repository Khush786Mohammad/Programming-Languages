class helper{
    public static final double PI = 3.141;

    //static variable
    static int a = 10;
    //instance variable
    int b = 20;
    
    public helper(){
        System.out.println("Default Constructor");
    }
    // static method
    public static int add(int a , int b){
        return a+b;
    }

    //static method

    static void m1(){
        System.out.println("a: "+a);
        //non static variable are not access by static methods
        // System.out.println("b: "+b);

        //static methods cannot refers to this or super keywords as these are used to refers current object instances
        // which doesn't exit in static context..
        // this.a = 20;

        //static methods cannot directly call non-static methods

        //m2(); // Error

        System.out.println(add(100,200));
        helper h1 = new helper();
        h1.m2();
    }

    public void m2(){
        System.out.println("This is m2 function");
    }
}

public class StaticMethod {
    public static void main(String[] args){
        helper h1 = new helper();
        System.out.println(helper.add(10,12));
        int radius = 5;
        System.out.println(helper.PI*radius*radius);
        helper.m1();
    }
}
