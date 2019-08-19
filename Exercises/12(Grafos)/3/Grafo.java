package studygrafo3;

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
    
    //EXC 6 - VEIRIFCA SE TEM CICLO NO GRAFO
    public boolean ciclo(){
        //Acha os adjacente de cada v, quando acha verifica se tem um caminho w-v 
        for (int v = 0; v < this.V; v++) {
            for (int w = 0; w < this.V; w++) {
                boolean visitados[] = new boolean [this.V];
                
                if(this.adj[v][w] == 1){
                    busca_prof(w, visitados);
                }
                if(visitados[v]){
                    return visitados[v];
                }
            }
        }
        return false;
    }
    
    public void busca_prof(int v, boolean visitados[]){
        visitados[v] = true;
        
        for (int w = 0; w < this.V; w++) {
            if(this.adj[v][w] == 1 && visitados[w] == false){
                busca_prof(w,visitados);
            }
        }
    }
    
    //EXC 7 - TODAS ROTAS DE S A T
    public void rotasS_T(int v, int t, int i, int resp[]){
        resp[i] = v;
        
        if(v == t){
            for (int j = 0; j < this.V; j++) {
                System.out.print(resp[j]+" ");
                
                if(resp[j] == t){
                    break;
                }
            }
            System.out.println("");
        }
        
        for (int w = 0; w < this.V; w++) {
            if(this.adj[v][w] == 1){
                rotasS_T(w, t, i+1, resp);
            }
        }
    }
    
    
}
