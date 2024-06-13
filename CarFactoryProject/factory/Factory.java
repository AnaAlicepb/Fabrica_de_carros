package factory;

import car.Car;

public interface Factory {
    // Interface Factory que define os métodos para criar e servir um carro
    Car create(String carType); // Método para criar um carro
    void service(Car car); // Método para servir um carro
}
