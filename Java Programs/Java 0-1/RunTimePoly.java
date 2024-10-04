class A{
    public void m1(){
        System.out.println("Inside A's Method");
    }
}

class B extends A{
    @Override
    public void m1(){
        System.out.println("Inside B's Method");
    }
}

class C extends A{
    public void m1(){
        System.out.println("Inside C's Method");
    }
}
public class RunTimePoly {
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj1.m1();
        obj2.m1();
        obj3.m1();

        A obj4 = new B();
        obj4.m1();
    }
}
