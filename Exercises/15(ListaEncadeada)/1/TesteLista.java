package testelista;

/**
 *
 * @author Gustavo
 */
public class TesteLista {
    public static void main(String[] args) {
        
        ListaLigada objLista = new ListaLigada();
        
        //objLista.addInicio(10);
        //objLista.addInicio(20);
        //objLista.remInicio();
        //objLista.addOrdenado(15);
        objLista.addOrdenado(20);
        objLista.addOrdenado(30);
        objLista.addOrdenado(10);
        //System.out.println("LISTA: "+ objLista);
        //objLista.remOrdenado(30);
        //objLista.addFim(30);
        //objLista.remFim();
        //objLista.inverteNo();
        System.out.println("Achou o elemneto na iteração: "+objLista.buscaIterativa(10));
        System.out.println("Achou o elemneto na recursão: "+objLista.buscaRecursiva(20));
        System.out.println("LISTA: "+ objLista);
    }
    
}
