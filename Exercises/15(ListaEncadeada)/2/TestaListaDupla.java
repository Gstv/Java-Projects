package testalistadupla;

/**
 *
 * @author Gustavo
 */
public class TestaListaDupla {
    public static void main(String[] args) {
        ListaLigada objLista = new ListaLigada();
        
        objLista.addInicio(10);
        objLista.addInicio(20);
        objLista.addInicio(30);
        System.out.println(objLista);
        objLista.remFim();
        System.out.println(objLista);
        
    }
    
}
