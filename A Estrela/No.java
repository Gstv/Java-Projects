/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulabuscas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adalberto.bcpereira
 */
public class No {
    private int id;
    private float h, g, f;
    private boolean bloqueado, visitado;

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    private No pai;
    public  List<No> vizinhos = new ArrayList();

    public List<No> getVizinhos() {
        return vizinhos;
    }

    public int getId() {
        return id;
    }
    
    public No(int id){
        this.id = id;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getG() {
        return g;
    }

    public void setG(float g) {
        this.g = g;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    

    public boolean estaBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }
        
}
