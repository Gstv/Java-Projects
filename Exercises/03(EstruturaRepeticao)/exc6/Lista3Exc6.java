import java.util.Scanner;

public class Lista3Exc6{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num, repet=1, result=0;
    
    //ENTRADA
    
    System.out.println("Digite um valor inteiro:");
    num = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(repet <= 10){
      result = num * repet;
      System.out.printf("%d x %d = %d\n", repet, num, result);
      
      repet++;
    }
    
    
  }
}