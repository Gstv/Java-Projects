package grafoslista;

/**
 *
 * @author Gustavo
 */
public class Grafo {
    
    private int V;
    private int A;
    private No adj[];
    
    public Grafo(int V){
        this.V = V;
        this.A = 0;
        adj = new No[V];
    }
    
    public void insereA(int v, int w){
        No aux = this.adj[v];
        No ant = null;
        
        while(aux != null && aux.getElemento() <= w){
            if(aux.getElemento() == w)
                return;
            ant = aux;
            aux = aux.getProx();
        }
        
        // cria um novo no para representar a aresta v-w
        No novo = new No(w, aux);
        
        if(ant == null)// insere  no inicio
            this.adj[v]= novo;
        else // insre no meio e no fim
            ant.setProx(novo);
        
        this.A++;
    }
    
    public void removeA(int v, int w){
        //caso nao exista vertice v
        if(v > this.V || v < 0)
            System.out.println("Não existe essa aresta");
        
        //se estiver vazia nao faz nafa
        else if(this.adj[v] != null){
            No aux = this.adj[v];
            No ant = null;
            
            while(aux.getProx() != null && aux.getElemento() != w){
                ant = aux;
                aux = aux.getProx();
            }
            
            if(aux.getElemento() != w) //se nao achou o vertice w
                return;
            if(ant == null) //remove no inicio
                this.adj[v] = aux.getProx();
            else // remove no meio ou fim
                ant.setProx(aux.getProx());
                
            this.A--;
        }
    }
    
    public int indeg(int v){
        int grauEntrada=0;
        
        for (int i=0; i < this.V; i++) {
            for (No aux = this.adj[i]; aux != null; aux = aux.getProx()) {
                if(aux.getElemento() == v)
                    grauEntrada++;
            }
        }
        return grauEntrada;
    }
    
    public int outdeg(int v){
        No aux = this.adj[v];
        int grauSaida=0;
        
        while(aux != null){
            grauSaida++;
            aux = aux.getProx();
        }
        return grauSaida;
    }
    
    public boolean fonte(int v){
        if(this.indeg(v) == 0 && this.outdeg(v) > 0)
            return true;
        
        return false;
    }
    
    public void mostra( ){
        System.out.println("V:"+ this.V +" A:"+ this.A);
        
        for(int v = 0; v < this.V; v++){
            No aux = this.adj[v];
            System.out.print(v+":");
            
            while(aux != null){
                System.out.print(aux.getElemento()+" ");
                aux = aux.getProx();
            }
            System.out.println();
        }
    } 
}
