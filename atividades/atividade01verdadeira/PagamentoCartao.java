package atividades.atividade01verdadeira;

public class PagamentoCartao implements MetodoPagamento { 
    @Override 
    public void processarPagamento(double n1, double contaval){
        double coefTaxa = 1.01f;
        contaval = contaval - (n1 * coefTaxa);
        System.out.println("pagamento realizado com sucesso");
        System.out.printf("seu novo saldo e %f", contaval);

    }
    @Override 
    public void estornar(String id){
        System.out.println("pagamento estornado");
    }
}
