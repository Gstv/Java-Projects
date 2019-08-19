package grafos;

public class grafosStudy {
    public static void main(String[] args) {
        Grafo objGrafo;
        int seq[] = {4,5,1,4};
        
        // instancia um objeto da classe Grafo
        // passando o numero de vertices do grafo
        objGrafo = new Grafo(6);
       
        // insere as arestas
        objGrafo.insereA(0,1);
        objGrafo.insereA(0,2);
        objGrafo.insereA(1,2);       
        objGrafo.insereA(1,3);
        objGrafo.insereA(2,3);
        objGrafo.insereA(2,4);
        objGrafo.insereA(3,5);
        objGrafo.insereA(4,5);
        
        
        objGrafo.mostra();
        System.out.println("Indeg: "+objGrafo.indeg(3));
        System.out.println("Outdeg: "+objGrafo.outdeg(0));
        System.out.println("Fonte: "+objGrafo.fonte(0));
        System.out.println("É Caminho: "+objGrafo.caminho(seq)); 
        System.out.println("Caminho simples: "+objGrafo.caminho_simples(seq)); 
        System.out.println("\nExiste caminho: "+objGrafo.existe_caminho(0, 1, "caminho"));
        System.out.println("Ciclo na sequencia: "+objGrafo.existe_ciclo(seq));
        System.out.println("Ciclo no grafo: "+objGrafo.procura_ciclo());
    }
}
