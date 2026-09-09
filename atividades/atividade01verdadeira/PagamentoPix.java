package atividades.atividade01verdadeira;

public class PagamentoPix implements MetodoPagamento {
    @Override 
    public void processarPagamento(double n1, double contaval){
        contaval = contaval - n1;
        System.out.println("pagamento processado");
        System.out.println("sou novo saldo e: " + contaval);
    }
    @Override 
    public void estornar(String id){
        System.out.println("pagamento estornado");
    }
}
