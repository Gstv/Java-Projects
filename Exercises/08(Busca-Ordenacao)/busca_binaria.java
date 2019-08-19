package busca.e.orde;

/**
 * @author Gustavo
 */
public class BuscaEOrde {
    public static void main(String[] args) {
        int V[]= {1,2,3,4,5,6,7,8,9};
        int x=5;
        
        System.out.println("V["+buscaBin(V, x)+"]");
    }
    public static int buscaBin(int v[], int x){

        for(int i=0, f=v.length-1; i <= f;){
            int m = (i + f)/2;
            
            if (v[m] == x)
                return m;
            if (v[m] < x)
                i = m + 1;
            else 
                f = m - 1;
        }
        return -1;
    }
        
    
}
