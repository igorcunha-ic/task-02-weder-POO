package atividades.atividade03;

public class LampadaHue implements DispositivoRegulavel{
    private String status = "ligado";
    @Override
    public void ligar(){
        System.out.println("lampada ligada");
        status = "ligado";
    }
    @Override
    public void desligar(){
        System.out.println("lampada desligada");
        status = "desligado";
    }
    @Override
    public String obterStatus(){
        System.out.println("status: " + status);
        return status;
    }
    @Override 
    public void intensidade(int n){
        System.out.println("intensidade ajustada para " + n);
    }
}
