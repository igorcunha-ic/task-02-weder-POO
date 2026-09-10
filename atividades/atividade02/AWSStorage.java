package atividades.atividade02;

public class AWSStorage implements CloudStorageProvidor{
    @Override 
    public void uploadArquivo(String nome, byte[] dados){
        for(int i = 0; i < dados.length; i++){
            System.out.println(dados[i]);
        }
        System.out.println("arquivo " + nome + " uploadado");
    }
    @Override 
    public byte[] downloadArquivo(String nome){
        System.out.println("procurando arquivo com nome: " + nome);
        byte[] val = {10, 20, 30};
        return val;
    }
}
