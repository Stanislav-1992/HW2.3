public class Car extends WheelableTransport implements Wheelable,Engineable{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
            System.out.println("Меняем покрышку автомобиля");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyres();
        checkEngine();

    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
