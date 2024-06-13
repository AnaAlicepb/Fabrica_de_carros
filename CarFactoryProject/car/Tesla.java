package car;

public class Tesla implements Car {
    @Override
    public int getHorsePower() {
        return 1020; // Retorna a potência do Tesla
    }

    @Override
    public String getFuelSource() {
        return "Elétrico"; // Retorna a fonte de combustível do Tesla
    }

    @Override
    public String getColor() {
        return "Vermelho"; // Retorna a cor do Tesla
    }

    @Override
    public void startEngine() {
        System.out.println("Motor do Tesla ligado."); // Mensagem que indica que o motor do Tesla foi ligado
    }

    @Override
    public void clean() {
        System.out.println("Limpando o Tesla."); // Mensagem que indica que o Tesla está sendo limpo
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Verificação mecânica do Tesla."); // Mensagem que indica que a verificação mecânica do Tesla está sendo realizada
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Carregando o Tesla."); // Mensagem que indica que o Tesla está sendo carregado
    }
}
