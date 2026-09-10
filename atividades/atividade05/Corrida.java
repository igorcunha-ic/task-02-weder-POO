package atividades.atividade05;
public class Corrida {
    private CalcularTarifa calculadora;
    private final double distancia = 13.4f;
    private final int tempo = 10;
    public void mudarEstrategia(CalcularTarifa calculo){
        calculadora = calculo;
        System.out.println("mudando de estategia...");
    }
    public double getPrecoFinal(){
        return calculadora.calcular(distancia, tempo);
    }
}
