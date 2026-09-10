package atividades.atividade04;

public class Main {
    public static void main(String[] args) {
        String mensagem = "CORRE QUE TA PEGANDO FOGO foi encontrado um problema no seu, bem, isso é uma atividade então foi especificado em que vai dar defeito, dito isso: corre senao o seu reator nuclear vai explodir e levar a cidade inteira junto isso nem é o problema, pensa na surra que a sua mae vai te dar se isso acontecer, ela vai ficar p da vida (bem, isso se ela não morrer no processo, alias, isso se VOCE nao morrer no processo). alias, por preguica do desenvolvedor em fazer a atividade a mensagem vai ser a mesma independente do nivel";
        CanalNotificacao.NivelSeriedade nivel[] = {
            CanalNotificacao.NivelSeriedade.baixo,
            CanalNotificacao.NivelSeriedade.medio,
            CanalNotificacao.NivelSeriedade.alto
        };
        DespacheAlerta alerta = new DespacheAlerta();
        for (int i = 0; i < 3; i++) {
            alerta.processarAlerta(mensagem, nivel[i]);
        }
    }
}
