/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaabb;

/**
 *
 * @author Fofolho
 */
public class Pilha {
    private No pilha[];
    private int topo;
    
    public Pilha( int tamanho ) {
        pilha = new No[tamanho];
        topo = -1;
    }
    
    public void push (No e) {
        topo++;
        pilha[topo] = e;
    }
    
    public No pop() {
        No e = pilha[topo];
        topo--;
        return e;
    }
    
    public boolean isEmpty() {
        return topo == -1;
    }
    
    public boolean isFull() {
        return topo == pilha.length - 1;
    }
    
}