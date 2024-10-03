abstract class Machine{
    private int id;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public abstract void Start();
}

class Camera extends Machine{
    @Override
    public void Start(){
        System.out.println("Camera Started");
    }
}

class Car extends Machine{
    @Override
    public void Start(){
        System.out.println("Car Started");
    }
}

public class AbstractClasses {
    public static void main(String[] args){

        Camera cam1 = new Camera();
        cam1.setId(155);

        Car car1 = new Car();
        car1.setId(290);

        System.out.println("Camera id: " +cam1.getId());
        System.out.println("Car id : " +car1.getId());

        car1.Start();
        cam1.Start();
        // Machine mac1 = new Machine(); // error
    }
}
