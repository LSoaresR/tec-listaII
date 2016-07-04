
package sete;


public class ArquivoInexistente extends Exception{
    
    private String name;
  
    public ArquivoInexistente(String msg, String arq) {
        this.name = arq;
    }

    public String getNomeArquivo() {    
        return this.name;
    }
    
}
