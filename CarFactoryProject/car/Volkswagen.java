package car;

public class Volkswagen implements Car {
    @Override
    public int getHorsePower() {
        return 290; // Retorna a potência do Volkswagen
    }

    @Override
    public String getFuelSource() {
        return "Diesel"; // Retorna a fonte de combustível do Volkswagen
    }

    @Override
    public String getColor() {
        return "Azul"; // Retorna a cor do Volkswagen
    }

    @Override
    public void startEngine() {
        System.out.println("Motor do Volkswagen ligado."); // Mensagem que indica que o motor do Volkswagen foi ligado
    }

    @Override
    public void clean() {
        System.out.println("Limpando o Volkswagen."); // Mensagem que indica que o Volkswagen está sendo limpo
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Verificação mecânica do Volkswagen."); // Mensagem que indica que a verificação mecânica do Volkswagen está sendo realizada
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Abastecendo o Volkswagen."); // Mensagem que indica que o Volkswagen está sendo abastecido
    }
}
