package kvizinhosgustavo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Gustavo André de Almeida Santos
 */
public class KvizinhosGustavo {
    public static void main(String[] args) throws IOException{
        Ponto nPontos[] = leArquivo();
        principal(nPontos);
    }
    
    private static Ponto[] leArquivo() throws FileNotFoundException, IOException{
        // LE E ARMAZENA TODOS OS PONTOS DO ARQUIVO NO OBJETO NPONTOS
        FileReader objLeitura = new FileReader("arquivo.txt");
        BufferedReader objBufferizado = new BufferedReader(objLeitura);
        
        String linha = objBufferizado.readLine();
        int Qtd = Integer.parseInt(linha);
        Ponto pontos[] = new Ponto[Qtd];
        
        for (int i = 0; i < Qtd; i++){
            linha = objBufferizado.readLine();
            String guardaPonto[] = linha.split(" ");
            pontos[i] = new Ponto(Integer.parseInt(guardaPonto[0]),Integer.parseInt(guardaPonto[1]));
        }
        return pontos;
    }

    private static void principal(Ponto pontos[]) {
        // CODIGO PRINCIPAL EM QUE VAI TER TODA A LOGICA DO PROGRAMA
        Scanner ler = new Scanner (System.in);
        
        double guardaDist[]= new double[pontos.length];
        double temp[] = new double[pontos.length];
        int pontoX, pontoY, k;
        
        for (int i = 1; i == 1;) {
            System.out.println("Insira uma coordenada (X Y):");
            pontoX = ler.nextInt();
            pontoY = ler.nextInt();
            
            System.out.println("Quantos K vizinhos da coordenada deseja ver? (máx. "+pontos.length+")");
            k = ler.nextInt();
            
            Ponto kVizinhos[]= new Ponto[k];
            
            distanciaVizinhos(pontoX, pontoY, k, pontos, guardaDist, temp);
            ordenaDist(guardaDist);
            ordenaVizinhos(kVizinhos, pontos, guardaDist, temp, k);
            
            System.out.println("Os vizinhos mais próximos da coordenada ["+pontoX+","+pontoY+"] são:\n");
            
            for (int j=0, f=1; j < k; j++, f++)
                System.out.printf("%dº Coordenada "+kVizinhos[j]+": %.2f de distancia\n", f, guardaDist[j]);
            
            System.out.println("\nDeseja inserir outra coordenada?\n1-Sim\n2-Não");
            i = ler.nextInt();
        }
    }

    private static void distanciaVizinhos(int px, int py, int k, Ponto pontos[], double guardaDist[], double temp[]) {
        // ARMAZENA A DISTANCIA EM UM VETOR E NO OUTRO VETOR "GUARDA" DISTANCIA DO RESPECTIVO PONTO
        // PARA ENTÃO PRINTAR OS K VIZINHOS COM SUAS DISTANCIAS CORRETAS 
        for (int i = 0; i < pontos.length; i++) {
            guardaDist[i] = pontos[i].distancia(px, py);
            temp[i] = guardaDist[i];
        }
    }

    private static void ordenaDist(double[] d) {
        // ORDENA O VETOR DE DISTANCIAS
        for( int i=0; i < d.length; i++ ){
            for( int j = 0; j < d.length-1-i; j++ )
                if( d[j] > d[j+1] ){
                    double aux = d[j];
                    d[j]=d[j+1];
                    d[j+1]=aux;
                }
        }
    }

    private static void ordenaVizinhos(Ponto[] v, Ponto[] p, double[] dist, double[] temp, int k) {
        // PREENCHE E JÁ ORDENA OS K VIZINHOS USANDO OS VETORES DE DISTANCIA
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < p.length; j++) 
                if(dist[i] == temp[j])
                    v[i] = p[j];
        }
    }
}
