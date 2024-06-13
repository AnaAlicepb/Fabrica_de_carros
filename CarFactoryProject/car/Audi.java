package car;

public class Audi implements Car {
    @Override
    public int getHorsePower() {
        return 335;
    }

    @Override
    public String getFuelSource() {
        return "Petrol";
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public void startEngine() {
        System.out.println("Audi engine started.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Audi.");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Audi mechanic check.");
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Fueling Audi.");
    }
}
