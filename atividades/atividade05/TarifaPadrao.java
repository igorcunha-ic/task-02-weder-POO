package atividades.atividade05;
public class TarifaPadrao implements CalcularTarifa {
    @Override 
    public double calcular(double distancia, int tempo){
        return distancia / (tempo / 5);
    }
}
