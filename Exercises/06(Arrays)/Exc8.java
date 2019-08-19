package exc1;

/**
 * @author Gustavo
 */
public class Exc8 {
    public static void main (String args []){
        int V[] = { 5, 10, 3, 2, 4, 7, 9, 8, 5};
        
        System.out.println(comprimento(V));
    }
    
    public static int comprimento (int V[]){
        int result=0, guardaNum=0, guardaResult=1;
        
        for(int i=0; i < V.length; i++){
            if(i==0)
                guardaNum = V[i];
            
            else if(V[i] > guardaNum){
                guardaNum = V[i];
                guardaResult++;
            }
            else if(V[i] < guardaNum){
                guardaNum = V[i];
                if(guardaResult > result)
                    result = guardaResult;
                
                guardaResult = 1;
            }
        }
        return result;
    }
}
