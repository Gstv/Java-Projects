package busca.e.orde;

/**
 * @author Gustavo
 */
public class bolha_ordenacao {
    public static void  main( String args[] ){
  
    int [] v={ 4, 14, 15, 20, 80, 4, 1 };
      
    metodoBolha( v );
    imprimeVetor( v );
  }
  public static void metodoBolha( int [] v ){
  
    for( int i=0; i < v.length; i++ ){
      for( int j = 0; j < v.length-1-i; j++ )
        if( v[j] > v[j+1] ){ //troca
          int aux = v[j];
          v[j]=v[j+1];
          v[j+1]=aux;
        }
    }
  }
  public static void imprimeVetor( int [] v ){
    System.out.println();
  
    for( int i=0; i < v.length; i++ )
      System.out.print("v["+i+"]:"+v[i]+" ");
    
  }
}
