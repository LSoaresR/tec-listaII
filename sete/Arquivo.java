
package sete;

import java.io.*;

public class Arquivo {
    
    public static void abrirArquivo(String path) throws Exception{
        File file = new File(path);
        
        if(!file.exists()){
            throw new ArquivoInexistente("Arquivo Inexistente", file.getName());
        }
    }
    
    public static void main(String[] args) throws Exception {
        
        try {
            abrirArquivo("joao.txt");
        } catch(ArquivoInexistente erro) {
            System.out.println(erro.getNomeArquivo());
            
        }
    }
    
}
