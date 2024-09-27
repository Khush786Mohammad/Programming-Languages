import java.awt.*;
public class Car{
        int mileage=0;
        String licensePlate;
        Color paintColor;
        boolean indicator;

        public Car(int mileage, String licensePlate, Color paintColor, boolean indicator){
            this.mileage = mileage;
            this.licensePlate = licensePlate;
            this.paintColor = paintColor;
            this.indicator = indicator;
        }

        public void changePaintColor(Color newPaintColor){
            this.paintColor = newPaintColor;
        }
}