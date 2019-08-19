package testalistadupla;

/**
 *
 * @author Gustavo
 */
public class No {
    
    private int elemento;
    private No ant;
    private No prox;
    
    public No (int elemento, No ant, No prox){
        this.elemento = elemento;
        this.ant = ant;
        this.prox = prox;
    }
    
    public int getElemento(){
        return elemento;
    }
    
    public void setElemento(int elemento){
        this.elemento = elemento;
    }
    
    public No getProx(){
        return prox;
    }
    
    public void setProx(No prox){
        this.prox = prox;
    }
    
    public No getAnt(){
        return ant;
    }
    
    public void setAnt(No ant){
        this.ant = ant;
    }
    
    public String toString(){
        return "{"+this.elemento+","+this.prox+"}";
    }
}
