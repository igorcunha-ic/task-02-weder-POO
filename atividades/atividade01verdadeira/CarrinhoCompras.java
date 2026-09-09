package atividades.atividade01verdadeira;
public class CarrinhoCompras {
    private MetodoPagamento metodo;
    public void definirMetodo(MetodoPagamento metodo){
        this.metodo = metodo;
    }
    public void finalizarCompra(double valor, double contaval){
        metodo.processarPagamento(valor, contaval);
    }
}
