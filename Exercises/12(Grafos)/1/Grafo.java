package grafos;

class Grafo {
    private int V;  
    private int A;  
    private int adj[][]; 
    
    public Grafo(int V){
        this.V = V;
        this.A = 0; 
        adj = new int[V][V];
    }
    
    /*
    Método insere uma aresta v-w no grafo. Se o grafo já
    tem aresta v-w, o método não faz nada, após a inserção
    da aresta, o atributo A da classe é atualizado.
    */
    public void insereA(int v, int w){
        if(this.adj[v][w] == 0){
            this.adj[v][w] = 1;
            this.A++;
        }
    }
    
    /*
    Para cada vértice v do grafo, este método imprime, 
    em uma linha, todos os vértices adjacentes a v. 
    */
    public void mostra(){
        for (int v=0; v < this.V; v++){
            System.out.print(v+": ");
            for (int w=0; w < this.V; w++) {
                if(this.adj[v][w] == 1){
                    System.out.print(" "+w);
                }
            }
            System.out.println();
        }
    }
    
    /*
    Método remove uma aresta v-w no grafo. Se não 
    existe a aresta v-w, o método não faz nada. 
    */
    public void remove(int v, int w){
        if(this.adj[v][w] == 1){
            this.adj[v][w] = 0;
        }
    }
    
    //Método que calcula o grau de entrada de um vértice
    public int indeg(int v){
        int grauEntrada=0;
        
        for (int i = 0; i < this.V; i++) {
            grauEntrada+=this.adj[i][v];
        }
        return grauEntrada;
    }
    
    //Método que calcula o grau de saída de um vértice
    public int outdeg(int v){
        int grauSaida=0;
        
        for (int i = 0; i < this.V; i++) {
            grauSaida+=this.adj[v][i];
        }
        return grauSaida;
    }
    
    //Método verifica se o vértice é uma fonte
    public boolean fonte(int v){
        
        for (int i = 0; i < this.V; i++) {
            if(this.adj[i][v] == 1){
                return false;
            }
        }
        return true;
    }
    
    //Verifica se é caminho - Exc1 - Caminhos em Grafos
    public boolean caminho(int seq[]){
        
        for (int i = 0; i < seq.length-1; i++) {
            int v =  seq[i];
            int w = seq[i+1];
            if(this.adj[v][w] == 0){
                return false;
            }
        }
        return true;
    }
    
    /*
    Método verifica se é caminho simples - Exc2 - Caminhos em Grafos
    Não é caminho: -1, É caminho simples: 1, Não é caminho simples: 0
    */
    public int caminho_simples(int seq[]){
        
        for (int i = 0; i < seq.length-1; i++) {
            int v =  seq[i];
            int w = seq[i+1];
            if(this.adj[v][w] == 0){
                return -1;
            }
        }
        
        for (int i = 0; i < seq.length; i++) {
            for (int j = 0; j < seq.length; j++) {
                if(seq[i] == seq[j] && i != j){
                    return 1;
                }
            }
        }
        return 0;
    }
    
    //Método verifica se a sequencia é ciclo - Exc 5 - Caminhos em Grafos
    public boolean existe_ciclo(int seq[]){
        
        if(seq[0] == seq[seq.length-1]){
            for (int i = 0; i < seq.length-1; i++) {
                int v =  seq[i];
                int w = seq[i+1];
                if(this.adj[v][w] == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    //Método verifica se existe ciclo no grafo - Exc 6 - Caminhos em grafos
    public boolean procura_ciclo(){
        
        for (int v = 0; v < this.V; v++) {
            for (int w = 0; w < this.V; w++) {
                if(this.adj[v][w] == 1){
                    if(existe_caminho(w,v,"ciclo")){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    //Método verifica se existe caminho - Exc3 - Caminhos em Grafos
    public boolean existe_caminho(int s, int t, String metodo){
        
        int resp[] = new int [this.V];
        boolean visitados[] = new boolean[this.V];
        //vetor de boolean ja vem preenchido com false
        
        //variavel String metodo para imprimir ou nao os caminhos de tais chamadas
        boolean achou[] = {!metodo.equals("caminho")}; //uma posicao
        // se variavel metodo é diferente de "caminho", retorna true
        // não precisa de if pois o metodo equals retorna false ou true
        // o mesmo que: achou[0] = !metodo.equals("caminho");
                      
        // chama a funcao que faz a busca em profundidade a 
        // partir do vertice s
        
        print_caminhos(0, 0, resp);
        busca_prof(s, t, visitados, achou);
        
        // como saber se existe caminho até t ?
        // se visitados na posicao t eh igual a true - t foi visitado
        // caso contrario tem false na posicao t
        
        return visitados[t];
        
    }
    
    // Implementacao da busca em profundidade a partir de somente um vertice
    public void busca_prof(int v, int t, boolean visitados[], boolean achou[]){
        
        //marque v como visitado
        visitados[v]=true;
        
        // imprime caminho
        if(achou[0] == false){
            System.out.print(v+" ");
            if(v == t){
                achou[0] = true;
            }
        }
        //para Cada vértice w adjacente a v faça
        for( int w=0; w < this.V; w++){// w anda na linha da matriz
            // se w eh adjacente a v E
            // se w não foi visitado então
            if(this.adj[v][w]==1 && visitados[w]==false ){
                busca_prof( w, t, visitados, achou);
            }
        }
    }
    
    //Método printa todos os caminhos existentes - Exc7 - Caminhos em Grafos
    public void print_caminhos(int v, int i, int resp[]){
        
        resp[i] = v;
        
        if(v == this.V-1){
            for (int j = 0; j < this.V; j++) {
                System.out.print(resp[j]+1+" ");
                
                if(resp[j] == v)
                    break;
            }
            System.out.println();
        }
        
        for( int w=0; w < this.V; w++){
            if(this.adj[v][w]==1 ){
                print_caminhos( w, i+1,resp);
            }
        }
    }
}