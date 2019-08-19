package excmatrizes;

/**
 * @author Gustavo
 */
public class Exc7 {
    //multiplicação de matrizes
    public static void main (String args []){
        int A[][] = {{0,2},{-6,3}};
        int B[][] = {{1,3},{2,5}};
        
        int C[][]= mult(A, B);
        print(C);
    }
    
    public static int [][] mult (int A[][], int B[][]){
        int C[][] = new int [A.length][A[0].length];
        int m=0, p=0;
        
        //1 mult primeira linha A por primeira coluna B
        //2 mult segunda linha A por segunda coluna B
        for(int i=0; i < A.length; i++){
            for(int j=0; j < A[0].length; j++){
                int temp= A[i][j] * B[j][i];
                C[m][p]+= temp;
            }
            p++;
            m++;
        }
        
        p=1;
        m=0;
        //1 mult primeira linha A por segunda coluna B
        //2 mult segunda linha A por primeira coluna B
        for(int i=0; i < A.length; i++){
            for(int j=0, y=1; j < A[0].length; j++){
                if(i>0)
                    y=0;
                int temp= A[i][j] * B[j][y];
                C[m][p]+= temp;
            }
            m++;
            p--;
        }
        return C;
    }
    
    public static void print (int C[][]){
        
        for(int i=0; i < C.length; i++){
            for(int j=0; j < C[0].length; j++)
                System.out.print(C[i][j]+" ");
            System.out.println();
        }
    }
}
