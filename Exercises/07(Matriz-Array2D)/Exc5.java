package excmatrizes;
import java.util.Scanner;

/**
 * @author Gustavo
 */
public class Exc5 {
    public static void main (String args []){
        Scanner ler = new Scanner (System.in);
        
        int A[][]= new int [3][3];
        int B[][] = new int [3][3];
        
        for(int i=0; i < A.length; i++)
            for(int j=0; j < A[0].length; j++){
                System.out.print("["+i+"]["+j+"]: ");
                A[i][j]= ler.nextInt();
                B[i][j]= ler.nextInt();
            }
        
        int C[][] = soma(A, B);
        print(C);
    }
    
    public static int [][] soma (int A[][], int B[][]){
        int C[][]= new int [A.length][A[0].length];
        
        for(int i=0; i < A.length; i++)
            for(int j=0; j < A[0].length; j++)
                C[i][j] = A[i][j] + B[i][j];
        
        return C;        
    }
    
    public static void print (int C[][]){
        
        for(int i=0; i < C.length; i++){
            for(int j=0; j < C[0].length; j++)
                System.out.print(C[i][j]);
            System.out.println();
        }
    }
}
