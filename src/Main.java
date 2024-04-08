public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("car1", 4);
        Vehicle carOne = new Car("car2", 4);
        Vehicle truck = new Truck("truck1", 6);
        Vehicle truckOne = new Truck("truck2", 8);
        Vehicle bicycle = new Bicycle("bicucle1", 2);
        Vehicle bicycleOne = new Bicycle("bicucle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(carOne);
        station.check(bicycle);
        station.check(bicycleOne);
        station.check(truck);
        station.check(truckOne);
    }
}