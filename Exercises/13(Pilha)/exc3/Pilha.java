package exc3;

public class Pilha {
    private char elementos[];
    private int topo;
    
    public Pilha(int tamanho){
        this.elementos = new char [tamanho];
        this.topo = -1;
    }
    
    //EMPILHAMENTO
    public void push (char elemento){
        this.topo++;
        this.elementos[topo] = elemento;
    }
    
    //DESEMPILHAMENTO
    public char pop(){
        
        //retira elemento do topo
        char elemento=elementos[topo];
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
