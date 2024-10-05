class Machine{
    public void Start(){
        System.out.println("Machine Started");
    }
}

interface HelloInterface{
    public void sayHello();
}

public class AnonymousClasses {
    public static void main(String[] args){
        Machine machine1 = new Machine(){
            @Override
            public void Start(){
                System.out.println("Machine Failed to start");
            }
        };
        machine1.Start();
        HelloInterface f1 = new HelloInterface(){
            @Override
            public void sayHello(){
                System.out.println("Hello there");
            }
        };
        f1.sayHello();
    }
}
