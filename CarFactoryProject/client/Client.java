package client;

import car.Car;
import factory.CarFactory;
import factory.CompanyCarFactory;
import factory.Factory;

public class Client {
    public static void main(String[] args) {
        Factory carFactory = new CarFactory();
        Factory companyCarFactory = new CompanyCarFactory();

        Car tesla = carFactory.create("Tesla");
        tesla.startEngine();
        carFactory.service(tesla);

        Car audi = companyCarFactory.create("Audi");
        audi.startEngine();
        companyCarFactory.service(audi);
    }
}
