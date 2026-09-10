package atividades.atividade03;

public class Main {
    public static void main(String[] args) {
        LampadaHue lampada = new LampadaHue();
        FechaduraIntelbras tranca = new FechaduraIntelbras();
        lampada.ligar();
        lampada.desligar();
        lampada.intensidade(100);
        lampada.obterStatus();
        tranca.desligar();
        tranca.ligar();
        tranca.obterStatus();
        HubAutomacao hub = new HubAutomacao();
        hub.desligarTudo();
        System.out.println("eu sou foda");
    }
}
