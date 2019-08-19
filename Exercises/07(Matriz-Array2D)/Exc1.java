package excmatrizes;
import java.util.Scanner;
/**
 * @author Gustavo
 */
public class Exc1 {
    public static void main (String args []){
        Scanner ler = new Scanner (System.in);
        int n=0, m=0;
                
        System.out.print("Linhas:");
        n = ler.nextInt();
        
        System.out.print("Colunas:");
        m = ler.nextInt();
        
        int A[][] = new int [n][m];
        
        //ler valores pro vetor
        for(int i=0; i < A.length; i++)
            for(int j=0; j < A[0].length; j++)
                A[i][j] = ler.nextInt();
            
        
        int At[][] = transposta(A);
        print(At);
    }
    
    public static int [][] transposta (int matrizA[][]){
        int linhasAt = matrizA[0].length;
        int colunasAt = matrizA.length;
        int At[][] = new int [linhasAt][colunasAt];
        
        for(int i=0; i < matrizA.length; i++)
            for(int j=0; j < matrizA[0].length; j++)
                At[j][i] = matrizA[i][j];
        
        return At;
    }
    
    public static void print (int At[][]){
        
        for(int i=0; i < At.length; i++){
            for(int j=0; j < At[0].length; j++)
                System.out.print("A["+At[i][j]+"] ");
            
            System.out.println();
        }
    }
}
