import Service.ServiceStation;
import Transport.Bicycle;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ServiceStation serviceStation = new ServiceStation();
        Truck truck = new Truck("Kamaz", 10);
        serviceStation.check(truck);

        Car car = new Car("SsangYong Kyron", 4);
        serviceStation.check(car);

        Bicycle bicycle = new Bicycle("Stels", 2);
        serviceStation.check(bicycle);
    }
}