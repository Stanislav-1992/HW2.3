public abstract class WheelableTransport extends Vehicle {
    private int wheelsCount;

    public WheelableTransport(String modelName, int wheelsCount) {
        super(modelName);
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}


