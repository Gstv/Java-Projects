package exc1;

/**
 * @author Gustavo
 */
public class Exc5 {
    public static void main (String args []){
        int V[] = {3, 2, 1, 5, 6, 8, 9, 4};
        
        ordena(V);
        print(V);
    }
    
    public static void ordena (int V[]){
        int guardaImpar, guardaNum=0;
        
        //acha o primeiro numero impar do vetor e guarda na variavel
        for(int i=0; i < V.length; i++){
            if(V[i] % 2 != 0){
                guardaImpar = V[i];
                guardaNum = i;
                i = V.length;
            }
        }
        
        //pega os numeros pares e coloca antes do primeiro impar
        for(int i=guardaNum; i < V.length; i++){
            if(V[i] % 2 == 0){
                int j = i;
                
                while(j > guardaNum){
                    int temp= V[j];
                    V[j] = V[j-1];
                    V[j-1] = temp;
                    j--;
                }
            }              
        }
    }
    
    public static void print (int V[]){
        
        for(int i=0; i < V.length; i++)
            System.out.print(V[i]+" ");
    }
}
