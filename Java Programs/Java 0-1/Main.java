import java.awt.Color;
// import java.util.*;
public class Main {
    public static void main(String[] args){
        Car myCar = new Car(70,"UK04K1234",Color.RED, true);
        Car sallyCar = new Car(40,"UK04X9000",Color.WHITE,false);

        System.out.println("My Car License is " + myCar.licensePlate);
        System.out.println("Sally's Car License is" + sallyCar.licensePlate);

        System.out.println("My Car Color is " + myCar.paintColor);

        myCar.changePaintColor(Color.GREEN);

        System.out.println("My Car Color is " + myCar.paintColor);
    }
}
