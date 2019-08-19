package excmatrizes;

import java.util.Scanner;

/**
 * @author Gustavo
 */
public class Exc3 {
    public static void main (String args []){
        Scanner ler = new Scanner (System.in);
        
        int A[][] = new int [3][3];
        
        //ler os valores
        for(int i=0; i < A.length; i++)
            for(int j=0; j < A[0].length; j++){
                System.out.print("A["+i+"]["+j+"]:");
                A[i][j] = ler.nextInt();
            }
        
        System.out.println(matrizQuadrada(A));
    }
    
    public static int matrizQuadrada (int A[][]){
        int result=0;
        
        for(int i=0, j=0; i < A.length; i++, j++)
            result+= A[i][j];
        
        return result;
    }
}
