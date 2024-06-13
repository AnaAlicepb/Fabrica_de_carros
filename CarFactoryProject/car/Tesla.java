package car;

public class Tesla implements Car {
    @Override
    public int getHorsePower() {
        return 1020;
    }

    @Override
    public String getFuelSource() {
        return "Electric";
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla engine started.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Tesla.");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Tesla mechanic check.");
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Charging Tesla.");
    }
}
