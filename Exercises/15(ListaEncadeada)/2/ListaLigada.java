package testalistadupla;

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
        this.inicio = new No (elemento, null, this.inicio);
        
        No aux = this.inicio;
        No ant = null;
        
        while(aux != null){
            aux.setAnt(ant);
            ant = aux;
            aux = aux.getProx();
        }
    }
    
    //remove o primeiro No
    public void remInicio(){
        if(!this.isEmpty()){
            this.inicio = this.inicio.getProx();
            this.inicio.setAnt(null);
        }
        else{
            System.out.println("A lista tá mais cheia que seu ânus caralho!!!");
        }
    }
    
    //remove o ultimo No
    public void remFim(){
        No aux = this.inicio;
        
        if(!this.isEmpty()){
            while(aux.getProx() != null){
                aux = aux.getProx();
            }
        }
        if(aux.getAnt() == null)
            this.inicio = null;
        else
            aux.getAnt().setProx(null);
    }
    
    public boolean isEmpty(){
        return this.inicio == null;
    }
    
    public String toString (){
        return this.inicio + "";
    }
}
