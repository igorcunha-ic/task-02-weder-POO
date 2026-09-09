package atividades.atividade01;

public class Calculadora implements Calculos{
    @Override 
    public double soma(double n1, double n2){
        return n1 + n2;
    }
    @Override 
    public double subtracao(double n1, double n2){
        return n1 - n2;
    }
    @Override 
    public double multiplicacao( double n1, double n2){
        return n1 * n2;
    }
    
}
