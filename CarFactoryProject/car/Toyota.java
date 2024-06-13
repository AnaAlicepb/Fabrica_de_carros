package car;

public class Toyota implements Car {
    @Override
    public int getHorsePower() {
        return 200;
    }

    @Override
    public String getFuelSource() {
        return "Hybrid";
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota engine started.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Toyota.");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Toyota mechanic check.");
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Fueling Toyota.");
    }
}
