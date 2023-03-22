public class SUV extends Carro {
    
    public SUV() {
        super("SUV", TipoCombustivel.GASOLINA, 8, 55);
    }

    @Override
    public String toString() {
        return "Modelo: " + getModelo() + "\n" +
               "Combustível disponível: " + getCombustivelDisponivel() + " litros\n";
    }
}
