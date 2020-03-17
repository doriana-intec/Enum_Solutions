package jp.ekata.car_app;

public class CarApp {
    public static void main(String[] args) {

        Car car1 = new Car(2019,Model.E_TRON,Color.BLACK);
        Car car2 = new Car(2018,Model.CONVERTIBLE,Color.RED);

        System.out.println(car1);
        System.out.println(car2);
    }
}
