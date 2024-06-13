package car;

public class Audi implements Car {
    @Override
    public int getHorsePower() {
        return 335; // Retorna a potência do Audi
    }

    @Override
    public String getFuelSource() {
        return "Gasolina"; // Retorna a fonte de combustível do Audi
    }

    @Override
    public String getColor() {
        return "Preto"; // Retorna a cor do Audi
    }

    @Override
    public void startEngine() {
        System.out.println("Motor do Audi ligado."); // Mensagem que indica que o motor do Audi foi ligado
    }

    @Override
    public void clean() {
        System.out.println("Limpando o Audi."); // Mensagem que indica que o Audi está sendo limpo
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Verificação mecânica do Audi."); // Mensagem que indica que a verificação mecânica do Audi está sendo realizada
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Abastecendo o Audi."); // Mensagem que indica que o Audi está sendo abastecido
    }
}
