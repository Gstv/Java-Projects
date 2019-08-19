package excmatrizes;
import java.util.Scanner;

/**
 * @author Gustavo
 */
public class Exc2 {
    public static void main (String args []){
        Scanner ler = new Scanner (System.in);
        int n, m;
        
        System.out.println("Linhas:");
        n = ler.nextInt();
        
        System.out.println("Colunas:");
        m = ler.nextInt();
        
        int A[][] = new int [n][m];
        
        //ler valoras pra matriz
        for(int i=0; i < A.length; i++)
            for(int j=0; j < A[0].length; j++)
                A[i][j] = ler.nextInt();
        
        System.out.println(maior(A));
    }
    
    public static int maior (int A[][]){
        int result=0;
        
        for(int i=0; i < A.length; i++)
            for(int j=0; j < A[0].length; j++)
                if(A[i][j] > result)
                    result = A[i][j];
        
        return result;
    }
}
