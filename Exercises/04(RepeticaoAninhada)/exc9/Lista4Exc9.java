public class Lista4Exc9{
  public static void main (String args []){
    
    int repetLinha=8, repetNum=0, num=1;
    String espaco="  ";
    
    //PROCESSAMENTO
    
    while(repetLinha >= 0){
      
      while(repetNum <= 9){
        if(repetNum >= repetLinha){
          if(repetNum < 8){
          System.out.print(" "+num);
          }
          num++;
          if(repetNum == 9 && num > 2){
            num -= 2;
            System.out.print(" "+num);
            repetNum--;
          }
        }
        else
          System.out.print(espaco);
        
        repetNum++;
      }
      
      System.out.println();
      repetNum=0;
      num=1;
      repetLinha--;
    }
    
    
  }
}
        
        