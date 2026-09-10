package atividades.atividade04;

public class NotificacaoSlack implements CanalNotificacao {
    @Override 
    public void enviarAlerta(String mensagem, NivelSeriedade nivel){
        System.out.println("alerta de risco -> nivel de risco: " + nivel);
        System.out.println(mensagem);
        System.out.println("notificacao slack");
    }
}
