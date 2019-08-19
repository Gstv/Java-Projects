package excmatrizes;
import java.util.Scanner;

/**
 * @author Gustavo
 */
public class Exc4 {
    public static void main (String args []){
        Scanner ler = new Scanner (System.in);
        
        int A[][]= new int [3][3];
        
        //ler os valores
        for(int i=0; i < A.length; i++)
            for(int j=0; j < A[0].length; j++){
                System.out.print("A["+i+"]["+j+"]: ");
                A[i][j] = ler.nextInt();
            }
        
        System.out.println(simetrica(A));
    }
    
    public static boolean simetrica (int A[][]){
        boolean result = false;
        
        for(int i=0; i < A.length; i++)
            for(int j=0; j < A[0].length; j++){
                if(A[i][j] == A[j][i])
                    result = true;
                else
                    return result = false;
            }
        return result;
    }
}
