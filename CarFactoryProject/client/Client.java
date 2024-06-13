package client;

import car.Car;
import factory.CarFactory;
import factory.CompanyCarFactory;
import factory.Factory;

public class Client {
    public static void main(String[] args) {
        // Criação de uma fábrica de carros
        Factory carFactory = new CarFactory();
        // Criação de uma fábrica de carros da empresa
        Factory companyCarFactory = new CompanyCarFactory();

        // Criação e serviço do carro Tesla
        Car tesla = carFactory.create("Tesla");
        tesla.startEngine(); // Inicia o motor do Tesla
        carFactory.service(tesla); // Realiza o serviço no Tesla

        // Criação e serviço do carro Audi
        Car audi = companyCarFactory.create("Audi");
        audi.startEngine(); // Inicia o motor do Audi
        companyCarFactory.service(audi); // Realiza o serviço no Audi
    }
}
