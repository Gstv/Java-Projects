import java.util.Scanner;

public class Lista4Exc8{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int contLinhas=0, contAst=0, num=0, num2=1;
    
    //PROCESSAMENTO
    
    while(contLinhas < 9){
      while(contAst < 9){
        num+= num2;
        if(num <= 9)
          System.out.print("   "+num);
        else
          System.out.print("  "+num);
        contAst++;
      }
      System.out.println();
      contAst=0;
      num=0;
      num2++;
      contLinhas++;
    }
    
  }
}
  