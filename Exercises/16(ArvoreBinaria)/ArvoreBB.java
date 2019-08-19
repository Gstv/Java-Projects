/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaabb;

/**
 *
 * @author fabio.aglubacheski
 */
public class ArvoreBB{
    private No raiz;// endereço inicial da lista
    
    public ArvoreBB(){
        this.raiz = null;
    }
    public void adiciona( int elemento ){
        No aux = this.raiz; // comeca pegando a raiz da arvore
        No pai=null;
        while( aux !=null ){
            //guarda o pai
            pai = aux;
            if( elemento < aux.getElemento()) // vai para esquerda
                aux = aux.getEsq();
            else if( elemento > aux.getElemento()) // vai para direita 
                aux = aux.getDir();
            else
                return;
        }
        // sempre insere em uma folha
        No novo = new No(elemento);
        // decidir se insere a esquerda ou a direita do pai
        // ou se insere com o raiz da arvore o novo no
        if( this.raiz == null)
            this.raiz = novo;
        else if( elemento < pai.getElemento()) // insere a esquerda
            pai.setEsq(novo);
        else// insere a direita
            pai.setDir(novo);
    
    }
    
    public void recursivo(int elemento){
        adcRecursivo(elemento, this.raiz, null);
    }
    
    public void adcRecursivo(int elemento, No aux, No pai){
        if(aux != null){
            if(elemento < aux.getElemento()){ // vai para esquerda
                adcRecursivo(elemento, aux.getEsq(), aux);
                return;
            }
            else if( elemento > aux.getElemento()){ // vai para direita 
                adcRecursivo(elemento, aux.getDir(), aux);
                return;
            }
        }
        
        No novo = new No(elemento);
        
        if(this.raiz == null)
            this.raiz = novo;
        else if( elemento < pai.getElemento()) // insere a esquerda
            pai.setEsq(novo);
        else// insere a direita
            pai.setDir(novo);
    }
    
    public boolean busca(int elemento){
        No aux = this.raiz;
        
        while(aux != null){
            if(elemento < aux.getElemento())
                aux = aux.getEsq();
            else if(elemento > aux.getElemento())
                aux = aux.getDir();
            else //se é igual
                return true;
        }
        return false;
    }
    
    public boolean buscaRec(int elemento){
        return buscaRecursiva(elemento, this.raiz);
    }
    
    public boolean buscaRecursiva(int elemento, No aux){
        if(aux != null){
            if(elemento < aux.getElemento())
                return buscaRecursiva(elemento, aux.getEsq());
            else if(elemento > aux.getElemento())
                return buscaRecursiva(elemento, aux.getDir());
            else 
                return true;
        }
        return false;
    }
    
    public int conta(){
        return contaNo(this.raiz);
    }
    
    public int contaNo(No aux){
        if(aux == null)
            return 0;
        
        int esq = contaNo(aux.getEsq());
        int dir = contaNo(aux.getDir());
        
        return (esq + dir + 1);
    }
    
    public int altura(){
        return alturaBB(this.raiz);
    }
    
    public int alturaBB(No aux){
        if(aux != null){
            int esq = alturaBB(aux.getEsq());
            int dir = alturaBB(aux.getDir());
            
            if(esq > dir)
                return esq+= 1;
            else
                return dir+= 1;
        }
        
        return 0;
    }
    
    public int festiva(){
        return festivas(this.raiz, 0);
    }
    
    public int festivas(No aux, int fest){
        if(aux != null){
            fest = festivas(aux.getEsq(), ++fest);
            
            if(aux.getDir() != null)
                festivas(aux.getDir(), fest);
        }
        return fest;
    }
    
    public void inOrdem() {
        Pilha pilha = new Pilha(100);
        No aux = this.raiz;
        while (aux != null || !pilha.isEmpty()) {
            if (aux != null) {
                pilha.push(aux);
                aux = aux.getEsq();
            } else {
                aux = pilha.pop();
                System.out.print(aux.getElemento() + " ");
                aux = aux.getDir();
            }
        }
    }
    
   
    public void removeNo(int elemento){
        No aux = this.raiz;
        No pai = null;
        
        while(aux != null){
            if(elemento < aux.getElemento()){
                pai = aux;
                aux = aux.getEsq();
            }
            else if(elemento > aux.getElemento()){
                pai = aux;
                aux = aux.getDir();
            }
            else
                break;
        }
        
        if(pai == null)
            this.raiz = null;
        else if(elemento < pai.getElemento())
            pai.setEsq(null);
        else if(elemento > pai.getElemento())
            pai.setDir(null);
    }

    @Override
    public String toString() {
        //return inOrdem(this.raiz);
        //return preOrdem(this.raiz);
        return posOrdem(this.raiz);
    }
    private String inOrdem( No p ){
        String str="";
        if( p != null){
            str += inOrdem(p.getEsq());
            str += " "+p.getElemento();
            str += inOrdem(p.getDir());
        }
        return str;
    }
    
    private String preOrdem( No p ){
        String str="";
        if( p != null){
            str += " "+p.getElemento();
            str += preOrdem(p.getEsq());
            str += preOrdem(p.getDir());
        }
        return str;
    }
    
    private String posOrdem( No p ){
        String str="";
        if( p != null){
            str += posOrdem(p.getEsq());
            str += posOrdem(p.getDir());
            str += " "+p.getElemento();
        }
        return str;
    }
	
}

