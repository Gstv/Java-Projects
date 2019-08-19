package exc1;

/**
 * @author Gustavo
 */
public class Exc6 {
    public static void main (String args []){
        int V[] = {5, 6, 2, 7, 9, 1, 8, 3, 7};
        
        rearranjo(V);
        print(V);
    }
    
    public static void rearranjo (int V[]){
        int guardaPrim=0;
        
        for(int i=0; i < V.length; i++){
            if(i==0){
                guardaPrim=V[i];
            }
            else if(V[i] <= guardaPrim){
                
                int j= i;
                while(j > 0){
                    int guardaNum= V[j];
                    V[j] = V[j-1];
                    V[j-1] = guardaNum;
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
