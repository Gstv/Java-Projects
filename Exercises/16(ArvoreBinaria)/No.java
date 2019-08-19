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
public class No {
    // Atributos da classe
    private int elemento;
    private No esq;
    private No dir;

    // construtor da classe
    public No( int elemento, No esq, No dir){
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
    public No( int elemento){
        this.elemento = elemento;
        this.esq = null;
        this.dir = null;
    }
    public No getEsq(){
        return this.esq;
    }
    public No getDir(){
        return this.dir;
    }

    int getElemento() {
        return this.elemento;
    }

    void setEsq(No novo) {
        this.esq = novo;
    }

    void setDir(No novo) {
        this.dir = novo;
    }



}
