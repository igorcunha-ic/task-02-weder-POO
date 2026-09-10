package atividades.atividade04;

public interface CanalNotificacao {
    public enum NivelSeriedade{
        baixo, medio, alto;
    }
    void enviarAlerta(String mensagem, NivelSeriedade nivel);
}
