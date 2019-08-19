package exc1;

/**
 * @author Gustavo
 */
public class Exc4 {
    public static void main (String args []){
        int A[]={1,3,6,7}, B[]={2,4,5};
        
        int C[] = intercalacao(A, B);
        
        for(int i=0; i < C.length; i++){
            System.out.print(C[i]+" ");
        }
    }
    
    public static int [] intercalacao (int vetorA[], int vetorB[]){
        int vetorC[]= new int [vetorA.length + vetorB.length];
        
        for(int i=0, j=0, f=0; f < vetorC.length; f++){
            if(j < vetorB.length){
                if(vetorA[i] < vetorB[j]){
                    vetorC[f] = vetorA[i];
                    i++;
                }
                else if(vetorB[j] < vetorA[i]){
                    vetorC[f]= vetorB[j];
                    j++;
                }
            }
            else{
                vetorC[f]= vetorA[i];
                i++;
            }
        }
        return vetorC;
    }
}
