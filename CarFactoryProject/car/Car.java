package car;

public interface Car {
    int getHorsePower();
    String getFuelSource();
    String getColor();

    void startEngine();
    void clean();
    void mechanicCheck();
    void fuelVehicle();
}
