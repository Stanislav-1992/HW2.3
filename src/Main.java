public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicle = new Vehicle[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        ServiceStationTest station = new ServiceStationTest();
        station.check((Car) vehicle[0], null, null);
        station.check((Car) vehicle[1], null, null);
        station.check(null, (Bicycle) vehicle[4], null);
        station.check(null, (Bicycle) vehicle[5], null);
        station.check(null, null, (Truck) vehicle[2]);
        station.check(null, null, (Truck) vehicle[3]);
    }
}