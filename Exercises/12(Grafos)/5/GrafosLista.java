package grafoslista;

/**
 *
 * @author Gustavo
 */
public class GrafosLista {
    public static void main(String[] args) {
        Grafo objGrafo = new Grafo(4);
        
        objGrafo.insereA(0, 2);
        objGrafo.insereA(0, 1);
        objGrafo.insereA(0, 3);
        objGrafo.insereA(0, 2);
        objGrafo.insereA(3, 2);
        objGrafo.insereA(1, 2);
        objGrafo.insereA(3, 1);
        //objGrafo.removeA(0, 1);
        System.out.println("Grau Entrada:"+ objGrafo.indeg(3));
        System.out.println("Grau Saida:"+ objGrafo.outdeg(0));
        System.out.println("Fonte: "+ objGrafo.fonte(2));
       
        objGrafo.mostra();
    }
}
