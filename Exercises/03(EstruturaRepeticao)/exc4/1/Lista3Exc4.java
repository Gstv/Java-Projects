import java.util.Scanner;

public class Lista3Exc4{
  public static void main (String args []){
    
    int numero, repet=0, N=1;
    
    Scanner ler = new Scanner (System.in);
    
    
    //ENTRADA
    
    System.out.println("Insira um numero qualquer");
    numero = ler.nextInt();
    
      
    //PROCESSAMENTO
    
    while( numero > repet){
      System.out.println(N);
      N = N +2;
      repet++;
    
    }
    
    
    
  }
}