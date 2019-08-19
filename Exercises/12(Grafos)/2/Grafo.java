package studygrafos1;

/**
 *
 * @author Gustavo
 */
public class Grafo {
    private int V;
    private int A;
    private int adj[][];
    
    public Grafo(int v, int a){
        this.V = v;
        this.A = a;
        adj = new int[V][V];
    }
    
    public void insereA(int v, int w){
        if(this.adj[v][w] == 0){
            this.adj[v][w] = 1;
        }
    }
    
    public void removeA(int v, int w){
        if(this.adj[v][w] == 1){
            this.adj[v][w] = 0;
        }
    }
    
    public void mostra(){
        for (int v=0; v < this.V; v++) {
            System.out.print("Adj de "+ v+": ");
            
            for (int w = 0; w < this.V; w++) {
                if(this.adj[v][w] == 1){
                    System.out.print(w+" ");
                }
            }
            System.out.println("");
        }
    }
    
    //EXC 3 - RETORNA GRAU DE ENTRADA
    public int indeg(int v){
        int grauEntrada = 0;
        
        for (int w = 0; w < this.V; w++) {
            if(this.adj[w][v] == 1){
                grauEntrada++;
            }
        }
        return grauEntrada;
    }
    
    //EXC 3 - RETORNA GRAU DE SAIDA
    public int outdeg(int v){
        int grauSaida = 0;
        
        for (int w = 0; w < this.V; w++) {
            if(this.adj[v][w] == 1){
                grauSaida++;
            }
        }
        return grauSaida;
    }
    
    //EXC 4 - VERIFICA SE É FONTE
    public boolean fonte(int v){
        for (int w = 0; w < this.V; w++) {
            if(this.adj[w][v] == 1){
                return false;
            }
        }
        return true;
    }
    
}
