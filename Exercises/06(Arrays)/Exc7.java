package exc1;

/**
 * @author Gustavo
 */
public class Exc7 {
    public static void main (String args []){
        int V[]= {5, 2, 2, 3, 4, 4, 4, 4, 4, 1, 1};
        
        System.out.println(sequencia(V));        
    }
    
    public static int sequencia (int V[]){
        int result=1, guarda=0;
        
        for(int i=0; i < V.length; i++){
            if(i==0)
                guarda = V[i];
            
            if(guarda != V[i]){
                guarda = V[i];
                result++;
            }
        }
        return result;
    }
}
