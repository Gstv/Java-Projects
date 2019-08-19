package studygrafos1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class studyGrafo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        criaGrafo();
    }
    
    //EXC 5 - CONSTROE UM GRAFO APATIR DE UM ARQUIVO
    public static void criaGrafo() throws FileNotFoundException, IOException{
        FileReader objLeitura = new FileReader("arquivo.txt");
        BufferedReader objBufferizado = new BufferedReader(objLeitura);
        
        String linhaV = objBufferizado.readLine();
        String linhaA = objBufferizado.readLine();
        
        Grafo objGrafo = new Grafo(Integer.parseInt(linhaV), Integer.parseInt(linhaA));
        
        for (int i=0; i < Integer.parseInt(linhaA); i++) {
            linhaV = objBufferizado.readLine();
            String guarda[] = linhaV.split(" ");
            
            objGrafo.insereA(Integer.parseInt(guarda[0]), Integer.parseInt(guarda[1]));
        }
        
        objGrafo.mostra();
        System.out.println("Grau de entrada do vértice 0: "+objGrafo.indeg(0));
        System.out.println("Grau de saida do vértice 0: "+objGrafo.outdeg(0));
        System.out.println("Vertice 2 é fonte: "+objGrafo.fonte(2));
    }
}
