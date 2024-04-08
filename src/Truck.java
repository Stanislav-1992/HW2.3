public class Truck extends WheelableTransport implements Wheelable,Engineable,Trairable{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    @Override
    public void check() {

        System.out.println("Обслуживаем " + getModelName());
        updateTyres();
        checkEngine();
        checkTrailer();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }
}