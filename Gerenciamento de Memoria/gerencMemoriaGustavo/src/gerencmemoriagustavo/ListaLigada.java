package gerencmemoriagustavo;

public class ListaLigada {
    private No inicio;

    public ListaLigada(){
        this.inicio = null;
    }
    
    //Adiciona no inicio da lista
    public void addInicio(int memoria){
        this.inicio = new No(0, memoria, this.inicio);
    }
    
    //Procura o processo que sera removido e adiciona na lista de memoria livre ordenado pelo numero do endereço
    public void addLivres(int processo, ListaLigada alocados){
        No novo = null;
        
        for(No aux=alocados.inicio; aux != null; aux = aux.getProx()){
            if(aux.getProcesso() == processo){
                novo = new No(aux.getProcesso(), aux.getMemoria(), null);
                novo.setEndereco(aux.getEndereco());
                break;
            }
        }
        No aux = this.inicio;
        No ant = null;
        
        while(novo.getEndereco() > aux.getEndereco()){
            ant = aux;
            aux = aux.getProx();
        }
        
        if(ant != null){
            novo.setProx(aux);
            ant.setProx(novo);
        }
        else{
            novo.setProx(aux);
            this.inicio = novo;
        }
        
    }
    
    //Adiciona um novo processo sempre no final da lista
    public void addFim(int processo, int memoria, ListaLigada livres) {
        int temp = livres.inicio.getMemoria() + memoria;
        No best = livres.inicio;
        
        //Trecho pra pegar o endereco do melhor bloco para alocação
        for (No aux = livres.inicio; aux != null; aux = aux.getProx()) {
            if(aux.getMemoria() -  memoria < temp && aux.getMemoria() -  memoria >= 0){
                temp = aux.getMemoria() -  memoria;
                best = aux;
            }
        }
        
        No aux = this.inicio;
        No ant = null;
        while( aux != null){
            ant = aux;
            aux = aux.getProx();
        }
        No novo = new No(processo, memoria, null);
        novo.setEndereco(best.getEndereco());
        if( ant == null )
            this.inicio = novo;
        else
            ant.setProx(novo);
    }
    
    //Remove um No apartir do Nº do processo
    public void remOrdenado(int processo){
        No aux = this.inicio;
        No ant = null;
        
        while(aux.getProcesso() != processo){
            ant = aux;
            aux = aux.getProx();
        }
        if(ant == null && aux.getProx() == null)
            this.inicio = null;
        else if(ant == null && aux.getProx() != null)
            this.inicio = aux.getProx();
        else
            ant.setProx(aux.getProx());
    }
    
    //Faz a busca de um processo para verificar se existe ou não
    public boolean buscaProcesso(int processo) {
        for(No aux = this.inicio; aux != null; aux = aux.getProx())
            if(aux.getProcesso() == processo)
                return true;
        
        return false;
    }
    
    //Verifica se há memória principal disponível
    public boolean statusMemoria(int memoria){
        for(No aux=this.inicio; aux != null; aux = aux.getProx()){
            if(aux.getMemoria() - memoria > 0)
                return true;
        }
        return false;
    }
    
    //Imprime a lista de alocados (processos)
    public void printAlocados(){
        for(No aux=this.inicio; aux != null; aux = aux.getProx()){
            System.out.println("[NºProcesso: "+ aux.getProcesso() +"]\n[End: "+ aux.getEndereco() +"]\n[Tam: "+ aux.getMemoria() +"]\n");
        }
    }
    
    //Escolhe o melhor bloco livre para usar para iniciar um novo processo
    public void melhorBloco(int memoria){
        int temp = this.inicio.getMemoria() + memoria;
        No best = this.inicio;
        
        for (No aux = this.inicio; aux != null; aux = aux.getProx()) {
            if(aux.getMemoria() -  memoria < temp && aux.getMemoria() -  memoria >= 0){
                temp = aux.getMemoria() -  memoria;
                best = aux;
            }
        }
        best.setEndereco(best.getEndereco() + memoria);
        best.setMemoria(best.getMemoria() - memoria);
    }
    
    public void memoriaContigua(){
        for (No aux = this.inicio; aux !=null; aux = aux.getProx()) {
            for(No ant = aux.getProx(); ant != null; ant = ant.getProx()){
                if(aux.getEndereco() + aux.getMemoria() == ant.getEndereco()){
                    aux.setMemoria(aux.getMemoria() + ant.getMemoria());
                    aux.setProx(ant.getProx());
                }
            }
            
        }
    }
    
    //Imprime s lista de memória livre
    public void printLivres(){
        for(No aux=this.inicio; aux != null; aux = aux.getProx()){
            System.out.println("[End: "+ aux.getEndereco() +"]\n[Tam: "+ aux.getMemoria() +"]\n");
        }
    }
    
}

