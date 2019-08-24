package exer;

import java.io.Serializable;

/**
 *
 * @author gustavo.aasantos3
 */
class Exc6Jogador implements Serializable{
    private String nome;
    private int pontos;
    private int fase;
    
    Exc6Jogador(){
        nome = "PeterGado";
        pontos = 666;
        fase = 3;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getPontos(){
        return pontos;
    }
    
    public int getFase(){
        return fase;
    }
}
