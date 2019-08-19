package studygrafo2;

public class studyGrafo2 {
    public static void main(String[] args) {
        Grafo objGrafo = new Grafo(6);
        int seq[] = {0,2,4,5,1};
        
        objGrafo.insereA(0,2);
        objGrafo.insereA(0,3);
        objGrafo.insereA(0,4);
        objGrafo.insereA(2,1);
        objGrafo.insereA(2,4);
        objGrafo.insereA(3,4);
        objGrafo.insereA(3,5);
        objGrafo.insereA(4,1);
        objGrafo.insereA(4,5);
        objGrafo.insereA(5,1);
        
        System.out.println("Caminho: "+objGrafo.caminho(seq));
        System.out.println("Caminho Simples: "+objGrafo.caminhoSimples(seq));
        System.out.println("\nCaminho de 0 a 1: "+objGrafo.caminhoS_T(0,1));
        System.out.println("Ciclo: "+objGrafo.verificaCiclo(seq));
    }
    
}
