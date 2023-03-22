public class SUVFlex extends Carro {
    
    public SUVFlex() {
        super("SUVFlex", TipoCombustivel.FLEX, 8, 65);
    }

    @Override
    public String toString() {
        return "Modelo: " + getModelo() + "\n" +
               "Combustível disponível: " + getCombustivelDisponivel() + " litros\n";
    }
}
