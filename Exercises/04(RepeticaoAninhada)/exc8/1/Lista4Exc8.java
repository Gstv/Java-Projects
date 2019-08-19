public class Lista4Exc8{
  public static void main (String args []){
    
    int repetLinha=1, repetNum=0, temp=1, tempMultiplica=2;
    
    //PROCESSAMENTO
    
    while(9 >= repetLinha){
      
      while(9 > repetNum){
        
        if(repetLinha == 1){
        System.out.print(temp +"   ");
        temp++;
        }
        else{
          System.out.print(temp+"  ");
          temp= repetLinha * tempMultiplica;
          tempMultiplica++;
          if(repetLinha < 5 && temp < 10){
            System.out.print(" ");
          }
        }
        repetNum++;
      }
      System.out.println();
      repetNum=0;
      repetLinha++;
      tempMultiplica=2;
      temp= repetLinha;
    }
  }
}
      
      