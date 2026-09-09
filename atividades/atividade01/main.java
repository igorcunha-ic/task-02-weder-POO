package atividades.atividade01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        try {
            System.out.print("Digite o primeiro valor (Double): ");
            Double valor1 = scanner.nextDouble();
            System.out.print("Digite o segundo valor (Double): ");
            Double valor2 = scanner.nextDouble();
            System.out.println("\n--- Resultados ---");
            System.out.println("Soma: " + calculadora.soma(valor1, valor2));
            System.out.println("Subtração: " + calculadora.subtracao(valor1, valor2));
            System.out.println("Multiplicação: " + calculadora.multiplicacao(valor1, valor2));
        } catch (Exception e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números válidos (use vírgula dependendo do seu idioma do sistema).");
        } finally {
            scanner.close();
        }
    }
}
