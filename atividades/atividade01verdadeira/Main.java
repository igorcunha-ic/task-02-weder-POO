package atividades.atividade01verdadeira;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int pid = random.nextInt(100) + 1;
        String id = String.valueOf(pid);
        double contaval = 100000.00f;
        double val = 300.00f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saldo disponivel: " + contaval + "valor da compra: " + val);
        System.out.println("1 - Cartão");
        System.out.println("2 - Pix");
        int opc = scanner.nextInt();
        MetodoPagamento metodo;
        if (opc == 1) {
            metodo = new PagamentoCartao();
        } else if (opc == 2) {
            metodo = new PagamentoPix();
        } else {
            System.out.println("Opção inválida");
            return;
        }
        try {
            metodo.processarPagamento(val, contaval); 
        } catch (Exception e) {
            metodo.estornar(id);
        }
    }
}

