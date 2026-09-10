package atividades.atividade05;
public class TarifaDinamica implements CalcularTarifa {
    private final double fatorChuva = 1.3f;
    @Override 
    public double calcular(double distancia, int tempo){
        return (distancia / (tempo / 5)) * fatorChuva;
    }
}
