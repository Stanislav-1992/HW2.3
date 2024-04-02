public class Car extends Vehicle{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        for (int i = 1; i < getWheelsCount(Car); i++) {


            System.out.println("Меняем покрышку №" + i);
        }
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
