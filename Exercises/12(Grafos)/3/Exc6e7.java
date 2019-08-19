package studygrafo3;

public class Exc6e7 {
    public static void main(String[] args) {
        Grafo objGrafo = new Grafo(6);
        int resp[] = new int [6];
        
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
        
        
        System.out.println("Existe ciclo: "+objGrafo.ciclo());
        System.out.println("Rotas de 0 a 1: ");
        objGrafo.rotasS_T(0,1,0,resp);
    }
    
}
