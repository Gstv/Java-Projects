package studygrafo2;

public class Grafo {
    private int V;
    private int A;
    private int adj[][];

    public Grafo(int v) {
        this.V = v;
        this.A = 0;
        adj = new int[V][V];
    }
    
    public void insereA(int v, int w){
        if(this.adj[v][w] == 0){
            this.adj[v][w] = 1;
            this.A++;
        }
    }
    
    //EXC 1 - VERIFICA SE A SEQUENCIA É CAMINHO
    public boolean caminho(int seq[]){
        for (int i=0, j=1; j < seq.length; i++, j++) {
            int v = seq[i];
            int w = seq[j];
            if(this.adj[v][w] == 0){
                return false;
            }
        }
        return true;
    }
    
    //EXC 2 - VERIFICA SE É CAMINHO SIMPLES (VERTICES N SE REPETE)
    public int caminhoSimples(int seq[]){
        //VERIFICA SE NAO É CAMINHO
        for (int i=0, j=1; j < seq.length; i++, j++) {
            int v = seq[i];
            int w = seq[j];
            if(this.adj[v][w] == 0){
                return -1;
            }
        }
        //VERIFICA SE NAO É CAMINHO SIMPLES
        for (int i = 0; i < seq.length-1; i++) {
            for (int j = i+1; j < seq.length; j++) {
                if(seq[i] == seq[j]){
                    return 1;
                }
            }
        }
        //SE CHEGOU ATE AQUI É CAMINHO SIMPLES
        return 0;
    }
    
    //EXC 3 E 4 - CAMINHO DE S A T
    public boolean caminhoS_T(int s, int t){
        boolean visitados[] = new boolean[this.V];
        int resp[] = new int[this.V];
        
        busca_prof(s,0,t,resp,visitados);
        
        return visitados[t];
    }
    
    public void busca_prof(int v, int i, int t, int resp[], boolean visitados[]){
        visitados[v] = true;
        resp[i] = v;
        
        if(v == t){
            for (int j = 0; j < resp.length; j++) {
                System.out.print(resp[j]+" ");
                
                if(resp[j] == t)
                    break;
            }
        }
        
        for (int w = 0; w < this.V; w++) {
            if(this.adj[v][w] == 1 && visitados[w] == false){
                busca_prof(w,i+1,t,resp,visitados);
            }
        }
    }
    
    //EXC 5 - VERIFICA CICLO NA SEQUENCIA
    public boolean verificaCiclo(int seq[]){
        for (int i = 1; i < seq.length; i++) {
            if(seq[0] == seq[i]){
                return true;
            }
        }
        return false;
    }
    
}
