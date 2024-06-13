package car;

public class Toyota implements Car {
    @Override
    public int getHorsePower() {
        return 200; // Retorna a potência do Toyota
    }

    @Override
    public String getFuelSource() {
        return "Híbrido"; // Retorna a fonte de combustível do Toyota
    }

    @Override
    public String getColor() {
        return "Branco"; // Retorna a cor do Toyota
    }

    @Override
    public void startEngine() {
        System.out.println("Motor do Toyota ligado."); // Mensagem que indica que o motor do Toyota foi ligado
    }

    @Override
    public void clean() {
        System.out.println("Limpando o Toyota."); // Mensagem que indica que o Toyota está sendo limpo
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Verificação mecânica do Toyota."); // Mensagem que indica que a verificação mecânica do Toyota está sendo realizada
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Abastecendo o Toyota."); // Mensagem que indica que o Toyota está sendo abastecido
    }
}
