import java.util.Scanner;

public class Lista3Exc9{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num, repet=1, primo=0;
    
    //ENTRADA
    
    System.out.println("Digite um n�mero natural:");
    num = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(num >= repet){
      if(num % repet == 0){
        primo++;
      }
      repet++;
    }
    
    if(primo == 2)
      System.out.println(num+" � um n�mero primo.");
    
    else
      System.out.println(num+" n�o � um n�mero primo.");
      
  }
}