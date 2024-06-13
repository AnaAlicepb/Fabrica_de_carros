package factory;

import car.Car;
import car.Tesla;
import car.Audi;
import car.Toyota;
import car.Volkswagen;

public class CompanyCarFactory implements Factory {
    @Override
    public Car create(String model) {
        switch (model) {
            case "Tesla":
                return new Tesla();
            case "Audi":
                return new Audi();
            case "Toyota":
                return new Toyota();
            case "Volkswagen":
                return new Volkswagen();
            default:
                throw new IllegalArgumentException("Unknown model " + model);
        }
    }

    @Override
    public void service(Car car) {
        System.out.println("Company servicing car: " + car.getClass().getSimpleName());
        car.clean();
        car.mechanicCheck();
        car.fuelVehicle();
    }
}
