package atividades.atividade04;

public class DespacheAlerta {
    NotificacaoSMS sms = new NotificacaoSMS();
    NotificacaoSlack slack = new NotificacaoSlack();
    public void processarAlerta(String mensagem, CanalNotificacao.NivelSeriedade nivel){
        if (nivel == CanalNotificacao.NivelSeriedade.baixo){
            sms.enviarAlerta(mensagem, nivel);
        }
        if (nivel == CanalNotificacao.NivelSeriedade.medio|| nivel == CanalNotificacao.NivelSeriedade.baixo){
            slack.enviarAlerta(mensagem, nivel);
        }
    }
}
