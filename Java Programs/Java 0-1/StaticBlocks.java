class Test{
    static int a = 10;
    static int b;
    static String config_msg;
    public int c = 20;

    static{
        b = a*4;
        config_msg = "Value of b is done";
        System.out.println("Configuration: "+config_msg);
    }

    public Test(){
        System.out.println("Constructor calling");
    }

}

public class StaticBlocks {
    public static void main(String[] args){

        //static blocks can also be executed before constructor
        Test t1 = new Test();
        System.out.println(Test.a +" " + Test.b);
    }
}
