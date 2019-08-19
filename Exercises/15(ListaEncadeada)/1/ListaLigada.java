package testelista;

/**
 *
 * @author Gustavo
 */
public class ListaLigada {
    
    private No inicio;
    
    public ListaLigada(){
        this.inicio = null;
    }
    
    //adiciona no inicio
    public void addInicio(int elemento){
        this.inicio = new No (elemento, this.inicio);
    }
    
    //adiciona no final
    public void addFim(int elemento){
        No aux = this.inicio;
        No ant = null;
        
        while(aux != null){
            ant = aux;
            aux = aux.getProx();
        }
        
        No novo = new No (elemento, null);
        
        if(ant == null)
            this.inicio = novo;
        else
            ant.setProx(novo);
    }
    
    //remove o primeiro No
    public void remInicio(){
        if(!this.isEmpty()){
            this.inicio = this.inicio.getProx();
        }
        else{
            System.out.println("A lista tá mais cheia que seu ânus caralho!!!");
        }
    }
    
    //remove o ultimo No
    public void remFim(){
        No aux = this.inicio;
        No ant = null;
        
        if(!this.isEmpty()){
            while(aux.getProx() != null){
                ant = aux;
                aux = aux.getProx();
            }
        }
        if(ant == null)
            this.inicio = null;
        else
            ant.setProx(null);
    }
    
    //adiciona de forma ordenada
    public void addOrdenado(int elemento){
        No aux = this.inicio;
        No ant = null;
        
        while(aux != null){
            if(aux.getElemento() >= elemento)
                break;
            ant = aux;
            aux = aux.getProx();
        }
        No novo = new No (elemento, aux);
        
        if(ant == null)
            this.inicio = novo;
        else
            ant.setProx(novo);
    }
    
    //remove um elemento qualquer da lista
    public void remOrdenado(int elemento){
        No aux = this.inicio;
        No ant = null;
        
        if(!this.isEmpty() && buscaIterativa(elemento)){
            while(aux.getProx() != null && aux.getElemento() != elemento){
                ant = aux;
                aux = aux.getProx();
            }
            //quando precisar remover no inicio
            if(ant == null)
                this.inicio = aux.getProx();
            //quando precisar remover no meio ou fim
            else
                ant.setProx(aux.getProx());
        }
    }
    
    //inverte todos os elementos da lista
    public void inverteNo(){
        No novo = null;
        
        for (No aux=this.inicio; aux != null; aux=aux.getProx()) {
            novo = new No(aux.getElemento(), novo);
        }
        this.inicio = novo;
    }
    
    //faz busca interativa
    public boolean buscaIterativa(int elemento){
        No aux = this.inicio;
        
        while(aux != null){
            if(aux.getElemento() == elemento)
                return true;
            
            aux = aux.getProx();
        }
        return false;
    }
    
    //faz busca recursiva
    public boolean buscaRecursiva(int elemento){
        return testaRecursiva(elemento, this.inicio, this.inicio);
    }
    
    public boolean testaRecursiva(int elemento, No ant, No aux){
        if(aux != null){
            if(ant.getElemento() == elemento)
                return true;
            
            return testaRecursiva(elemento, aux, aux.getProx());
        }
        return false;
    }
    
    public boolean isEmpty(){
        return this.inicio == null;
    }
    
    public String toString (){
        return this.inicio + "";
    }
}
