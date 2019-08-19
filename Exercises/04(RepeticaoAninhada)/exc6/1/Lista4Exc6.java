public class Lista4Exc6{
  public static void main (String args []){
    
    int repetLinha=0, repetAsterist=0, temp=1;
    
    //PROCESSAMENTO
    
    while(10 > repetLinha){
      
      while(temp > repetAsterist){
        System.out.print(repetAsterist +" ");
        repetAsterist++;
      }
      System.out.println();
      repetAsterist=0;
      temp++;
      repetLinha++;
    }
    
  }
}