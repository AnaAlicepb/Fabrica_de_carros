package factory;

import car.Car;
import car.Tesla;
import car.Audi;
import car.Toyota;
import car.Volkswagen;

public class CarFactory implements Factory {

    @Override
    public Car create(String carType) {
        // Cria um carro com base no tipo especificado
        switch (carType) {
            case "Tesla":
                return new Tesla(); // Retorna uma instância de Tesla
            case "Audi":
                return new Audi(); // Retorna uma instância de Audi
            case "Toyota":
                return new Toyota(); // Retorna uma instância de Toyota
            case "Volkswagen":
                return new Volkswagen(); // Retorna uma instância de Volkswagen
            default:
                throw new IllegalArgumentException("Tipo de carro desconhecido: " + carType); // Lança exceção para tipo desconhecido
        }
    }

    @Override
    public void service(Car car) {
        // Realiza o serviço no carro
        System.out.println("Serviço de carro: " + car.getClass().getSimpleName()); // Imprime o nome do carro que está sendo servido
        car.clean(); // Limpa o carro
        car.mechanicCheck(); // Realiza a verificação mecânica no carro
        car.fuelVehicle(); // Abastece o carro
    }
}
