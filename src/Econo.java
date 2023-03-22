public class Econo extends Carro {
    private int kmRodados;

    public Econo() {
        super("Econo", TipoCombustivel.GASOLINA, 20, 55);
        kmRodados = 0;
    }

    @Override
    public int verificaSePodeViajar(int distancia) {
        double consumo = super.motor.getConsumo() - kmRodados/5000.0;
        if (consumo < 10) consumo = 10;
        int combustivelNecessario = (int) Math.ceil(distancia / consumo);
        if (super.tanque.getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return super.tanque.getCombustivelDisponivel() * super.motor.getConsumo();
        }
    }

    @Override
    public void viaja(int distancia) {
        kmRodados += distancia;
        super.viaja(distancia);
    }

    @Override
    public String toString() {
        return "Econo:\n  Modelo=" + getModelo() + "\n  Motor=" + super.motor +
                "\n  Tanque=" + super.tanque + "\n  Km rodados=" + kmRodados;
    }
}
