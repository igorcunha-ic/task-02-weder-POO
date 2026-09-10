package atividades.atividade03;

public class FechaduraIntelbras implements DispositivoInteligente {
    private String status = "ligado";
    @Override
    public void ligar(){
        System.out.println("fechadura ligada");
        status = "ligado";
    }
    @Override
    public void desligar(){
        System.out.println("fechadura desligada");
        status = "desligado";
    }
    @Override
    public String obterStatus(){
        System.out.println("status: " + status);
        return status;
    }
}
