public class Esportivo extends Carro {
    
    public Esportivo() {
        super("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
    }

    @Override
    public String toString() {
        return "Modelo: " + getModelo() + "\n" +
               "Combustível disponível: " + getCombustivelDisponivel() + " litros\n";
    }
}
