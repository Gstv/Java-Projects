package bombeirosgustavo;

public class Grafo {
    private int V;
    private int A;
    private int adj[][];

    public Grafo(int V) {
        this.V = V;
        this.A = 0;
        adj = new int [V][V];
    }
    
    //Insere aresta e verifica se os vértices são válidos
    public int insereA(int v, int w){
        boolean visitados[] = new boolean[this.V];
        
        //PAR DE ZEROS
        if(v == 0 && w == 0){
            return -1;
        }
        //PAR IGUAL 
        else if(v == w){
            return 0;
        }
        //PAR JÁ INSERIDO
        else if(this.adj[v][w] == 1){
            return -2;
        }
        //PAR CICLO
        else if(this.adj[v][w] == 0){
            busca_prof(w,v,visitados);
            if(visitados[v])
                return 1;
        }
        this.adj[v][w] = 1;
        this.A++;
        
        return 2;
    }
    
    //Busca em profundidade
    public void busca_prof(int v, int t, boolean visitados[]){
        visitados[v]=true;
        
        for( int w=0; w < this.V; w++){
            if(this.adj[v][w]==1 && visitados[w]==false ){
                busca_prof(w,t,visitados);
            }
        }
    }
    
    //Método printa todos os caminhos existentes
    public void print_caminhos(int v, int i, int incendio, int contRotas[], int resp[]){
        resp[i] = v;
        
        if(v == incendio){
            for (int j = 0; j < this.V; j++) {
                System.out.print(resp[j]+" ");
                
                if(resp[j] == incendio){
                    contRotas[0]+= 1; 
                    break;
                }
            }
            System.out.println();
        }
        
        for( int w=0; w < this.V; w++){
            if(this.adj[v][w] == 1){
                print_caminhos(w, i+1, incendio, contRotas, resp);
            }
        }
    }
}