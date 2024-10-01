//nested static class

class OuterClass{
    private static String msg = "Good Morning";
    private String myMsg = "Bye See you again";

    //static nested class
    public static class NestedStaticClass{
        public void printMsg(){
            System.out.println("Greeting from NestedStaticClass "+msg);
        }
    }

    public class InnerClass{
        public void display(){
            System.out.println("Greeting from InnerClass " +msg);
        }
        public void showMessage(){
            System.out.println(myMsg);
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args){
        //creating instance of nested static class

        OuterClass.NestedStaticClass nestedStatic = new OuterClass.NestedStaticClass();
        nestedStatic.printMsg();

        // OuterClass.InnerClass innerClass = new OuterClass.InnerClass();//error

        //In order to create instance of innerclass we need to first create instance of outer class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();

        //We can also create instance of inner class combining above two steps;

        OuterClass.InnerClass inner2 = new OuterClass().new InnerClass();

        inner2.showMessage();
    }
}
