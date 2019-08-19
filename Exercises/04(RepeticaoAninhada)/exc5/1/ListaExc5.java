public class ListaExc5{
  public static void main (String args []){
    
    int repetLinha=0, repetAsterist=0, temp=0;
    
    //PROCESSAMENTO
    
    while(10 > repetLinha){
      
      while(10 > repetAsterist){
        System.out.print(temp +" ");
        repetAsterist++;
      }
      System.out.println();
      repetAsterist=0;
      temp++;
      repetLinha++;
    }
  }
}
    
  
    
    