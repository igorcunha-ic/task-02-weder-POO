package atividades.atividade03;

import java.util.ArrayList;

public class HubAutomacao {
    private final ArrayList <DispositivoInteligente> dispositivos = new ArrayList<>();
    public void desligarTudo(){
        dispositivos.add(new FechaduraIntelbras());
        dispositivos.add(new LampadaHue());
        for(DispositivoInteligente dispositivo : dispositivos){
            System.out.println("desligando tudo...");
            dispositivo.desligar();
        }
    }
}
