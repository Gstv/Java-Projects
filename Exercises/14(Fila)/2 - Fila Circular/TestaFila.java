/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafila;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author fabio.aglubacheski
 */
public class TestaFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fila minhaFila = new Fila (4);
        //minhaFila.remove();
        minhaFila.insere(10);
        minhaFila.insere(20);
        minhaFila.insere(30);
        minhaFila.insere(40);
        System.out.println("consegui inserir 3 elementos");


        
    }
    
}
