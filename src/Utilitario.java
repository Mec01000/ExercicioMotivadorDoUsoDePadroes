public class Utilitario extends Carro {
    
    public Utilitario() {
        super("Utilitário", TipoCombustivel.DIESEL, 5, 70);
    }

    @Override
    public String toString() {
        return "Modelo: " + getModelo() + "\n" +
               "Combustível disponível: " + getCombustivelDisponivel() + " litros\n";
    }
}
