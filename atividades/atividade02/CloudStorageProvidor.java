package atividades.atividade02;

public interface CloudStorageProvidor {
    void uploadArquivo(String nome, byte[] dados);
    byte[] downloadArquivo(String nome);
}
