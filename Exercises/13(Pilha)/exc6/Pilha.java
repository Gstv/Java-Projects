package exc6;

public class Pilha {
    private String elementos[];
    private int topo;
    
    public Pilha(int tamanho){
        this.elementos = new String [tamanho];
        this.topo = -1;
    }
    
    //EMPILHAMENTO
    public void push (String elemento){
        this.topo++;
        this.elementos[topo] = elemento;
    }
    
    //DESEMPILHAMENTO
    public String pop(){
        
        //retira elemento do topo
        String elemento=elementos[topo];
        // desce o topo da pilha
        topo--;
        return elemento;
    }
    
    //CONULTA SE A PILHA ESTA VAZIA
    public boolean isEmpty(){
        return topo == -1;
    }
    
    //CONULTA SE A PILHA ESTA CHEIA
    public boolean isFull(){
        return topo == elementos.length-1;
    }
    
}
