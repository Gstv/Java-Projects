package bombeirosgustavo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 @author Gustavo André de Almeida Santos
*/

public class BombeirosGustavo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        criaGrafo();
    }
    
    public static void criaGrafo() throws FileNotFoundException, IOException{
        
        FileReader objLeitura = new FileReader("arquivo.txt");
        BufferedReader objBufferizado = new BufferedReader(objLeitura);
        
        String linha = objBufferizado.readLine();
        Grafo objGrafo = new Grafo(21); 
        
        int incendio = Integer.parseInt(linha); 
        int resp[] = new int [21];
        int contRotas[] = new int[1];
        int acao=0;
        int menorV=1;
        
        while(acao != -1) {
            linha = objBufferizado.readLine();
            String guarda[] = linha.split(" ");
            
            //Menor vértice do grafo entre 0 e 1
            if(guarda[0].equals("0") && !guarda[0].equals(guarda[1]))
                menorV = Integer.parseInt(guarda[0]);
            
            acao = objGrafo.insereA(Integer.parseInt(guarda[0]), Integer.parseInt(guarda[1]));
            
            switch (acao) {
                case 0:
                    System.err.println("ERRO! Par ("+guarda[0]+","+guarda[1]+") x e y devem ser diferentes!");
                    break;
                case -2:
                    System.err.println("ERRO! Par ("+guarda[0]+","+guarda[1]+") já inserido!");
                    break;
                case 1:
                    System.err.println("ERRO! Par ("+guarda[0]+","+guarda[1]+") forma ciclo!");
                    break;
                case 2:
                    System.out.println("Par ("+guarda[0]+","+guarda[1]+") OK!");
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("\nRotas: ");
        objGrafo.print_caminhos(menorV, 0, incendio, contRotas, resp);
        System.out.println("Existem "+contRotas[0]+" até a esquina "+ incendio);
        
        objBufferizado.close();
    }
}