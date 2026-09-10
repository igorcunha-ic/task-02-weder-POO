package atividades.atividade02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GerenciadorArquivos gerenciador = new GerenciadorArquivos();
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== GERENCIADOR DE ARQUIVOS =====");
            System.out.println("1 - Adicionar novo provedor");
            System.out.println("2 - Fazer upload");
            System.out.println("3 - Fazer download");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("\nQual provedor deseja adicionar?");
                    System.out.println("1 - azure");
                    System.out.println("2 - AWS");
                    System.out.print("Escolha: ");
                    int provedor = scanner.nextInt();
                    scanner.nextLine();
                    if (provedor == 1) {
                        gerenciador.addProvedor(new AzureStorage());
                        System.out.println("Azure adicionado!");
                    } else if (provedor == 2) {
                        gerenciador.addProvedor(new AWSStorage());
                        System.out.println("AWS adicionado!");
                    }else {
                        System.out.println("Provedor inválido.");
                    }
                    break;
                case 2:
                    System.out.print("Nome do arquivo: ");
                    String nomeUpload = scanner.nextLine();
                    System.out.print("Digite os dados do arquivo: ");
                    String texto = scanner.nextLine();
                    byte[] dados = texto.getBytes();
                    gerenciador.uploadTodos(nomeUpload, dados);
                    System.out.println("Upload realizado nos provedores.");
                    break;
                case 3:
                    System.out.print("Nome do arquivo para download: ");
                    String nomeDownload = scanner.nextLine();
                    gerenciador.downloadTodos(nomeDownload);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
