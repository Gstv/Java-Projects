package excmatrizes;
import java.util.Scanner;

/**
 * @author Gustavo
 */
public class Exc6 {
    public static void main (String args []){
        //multiplica uma matriz por vetor
        Scanner ler = new Scanner (System.in);
        
        int A[][] = {{1,1,1},{1,1,1},{1,1,1}};
        int B[] = {1,2,3};
                    
        int C[][] = mult(A, B);
        print(C);
    }
    
    public static int [][] mult (int A[][], int V[]){
        int C[][]= new int[A.length][A[0].length];
        
        for(int i=0, x=0; x < V.length;){
            for(int j=0; j < A[0].length; j++){
                A[i][j]*= V[x];
                C[i][j] = A[i][j];
            }
            i++;
            if(i >= A.length){
                x++;
                i=0;
            }
        }
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
