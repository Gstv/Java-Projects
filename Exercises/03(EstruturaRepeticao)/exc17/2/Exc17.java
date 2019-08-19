package lista3;

import java.util.Scanner;

public class Exc17 {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
        
      String num = ler.nextLine();
        
      boolean palindromo = false;
        
        

      for(int i=0, j=num.length(); i != j; i++, j--){
           
        int x = Integer.parseInt(num.substring(i,i+1));
           
        int y = Integer.parseInt(num.substring(j-1, j));
            
            

        if(x == y){
                
          palindromo = true;
                
          break;
            
        }
        
      }
        
      System.out.println(palindromo);
    
  }

}