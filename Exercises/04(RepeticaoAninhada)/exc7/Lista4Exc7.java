public class Lista4Exc7{
  public static void main (String args []){
    
    int repetLinha=0, repetAsterist=0, temp=10;
    String espaco="";
    
    //PROCESSAMENTO
    
    while(10 > repetLinha){
      System.out.print(espaco);
      
      while(temp > repetAsterist){
        System.out.print(repetAsterist +" ");
        repetAsterist++;
      }
      System.out.println();
      espaco= espaco + "  ";
      repetAsterist=0;
      temp--;
      repetLinha++;
    }
    
  }
}