public interface Wheelable {
    void updateTyre();

    int getWheelsCount();

    default void updateTyres() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
