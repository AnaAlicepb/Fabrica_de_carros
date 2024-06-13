package car;

public class Volkswagen implements Car {
    @Override
    public int getHorsePower() {
        return 290;
    }

    @Override
    public String getFuelSource() {
        return "Diesel";
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public void startEngine() {
        System.out.println("Volkswagen engine started.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Volkswagen.");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Volkswagen mechanic check.");
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Fueling Volkswagen.");
    }
}
