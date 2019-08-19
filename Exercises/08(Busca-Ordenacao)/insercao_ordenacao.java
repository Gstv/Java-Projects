package busca.e.orde;

/**
 * @author Gustavo
 */
public class insercao_ordenacao {
    public static void  main( String args[] ){
  
    int [] v={ 4, 14, 15, 20, 80, 4, 1 };
   
    metodoInsercao( v );
   
    imprimeVetor( v );
  }
  public static void metodoInsercao( int [] v )
  {
    int j, i, x;
    for( j=1; j < v.length; j++ ){
       x = v[j];
       i = j-1;
       while( i >= 0 && v[i] > x){
         v[i+1] = v[i];
         i--;
       }
       v[i+1] = x;
    }
 

  }
  public static void imprimeVetor( int [] v )
  {
    
    for( int i=0; i < v.length; i++ )
      System.out.println("v["+i+"]:"+v[i]);
  }
}
    
