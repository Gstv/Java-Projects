package gerencmemoriagustavo;

/**
 * @author Gustavo
 */

public class No {
    private int processo;
    private int end;
    private int memoria;
    private No prox;

    public No(int processo, int memoria, No prox) {
        this.processo = processo;
        this.end = 0;
        this.memoria = memoria;
        this.prox = prox;
    }

    public int getProcesso() {
        return processo;
    }
    
    public int getMemoria() {
        return memoria;
    }
    
    public int getEndereco() {
        return end;
    }

    public No getProx() {
        return prox;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    public void setEndereco(int end) {
        this.end = end;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
}
