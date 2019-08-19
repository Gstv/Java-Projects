package busca.e.orde;

/**
 *
 * @author Gustavo
 */
public class recursao {
    public static void main (String args []){
        int n=7;
        
        System.out.println(fusc(n));
    }
    
    public static int fusc( int n ){

        int aux;
        
        if( n <= 1 )
            return 1;
        if( n % 2 == 0 )
            return fusc( n/2 );
        
        return ( fusc((n-1)/2 ) + fusc((n+1)/2 ) );
    }

}
