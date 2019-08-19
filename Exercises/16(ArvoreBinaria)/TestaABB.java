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
public class TestaABB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreBB arvore = new ArvoreBB();
        // elementos adicionados por nivel
        arvore.recursivo(11);
        arvore.recursivo(5);
        arvore.recursivo(14);
        arvore.adiciona(4);
        arvore.adiciona(6);
        arvore.adiciona(12);
        arvore.adiciona(17);
        //arvore.removeNo(4);
        System.out.println(arvore.conta());
        System.out.println(arvore.altura());
        System.out.println(arvore.festiva());
        arvore.inOrdem();
        System.out.println(arvore.buscaRec(13));
        System.out.println(arvore.busca(13));
        System.out.println(arvore);
    }
    
}

