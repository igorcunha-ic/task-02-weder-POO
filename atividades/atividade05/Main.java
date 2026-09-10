package atividades.atividade05;

public class Main {
    public static void main(String[] args) {
        TarifaDinamica tarifaDinamica = new TarifaDinamica();
        TarifaPadrao tarifaPadrao = new TarifaPadrao();
        Corrida corrida = new Corrida();
        corrida.mudarEstrategia(tarifaPadrao);
        System.out.println("preco final: " + corrida.getPrecoFinal());
        corrida.mudarEstrategia(tarifaDinamica);
        System.out.println("preco final: " + corrida.getPrecoFinal());
    }
    
}
