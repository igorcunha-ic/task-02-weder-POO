package atividades.atividade02;

import java.util.ArrayList;

public class GerenciadorArquivos {
    private final ArrayList <CloudStorageProvidor> provedores = new ArrayList<>();
    
    public void addProvedor(CloudStorageProvidor provedor){
        provedores.add(provedor);
    }
    public void uploadTodos(String nome, byte[] dados){
        for(CloudStorageProvidor provedor : provedores){
            provedor.uploadArquivo(nome, dados);
        }
    }
    public void downloadTodos(String nome){
        for(CloudStorageProvidor provedor : provedores){
            provedor.downloadArquivo(nome);
        }
    }
}
