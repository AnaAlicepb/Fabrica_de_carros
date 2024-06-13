package factory;

import car.Car;

public interface Factory {
    Car create(String model);
    void service(Car car);
}
