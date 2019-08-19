import java.util.Scanner;

public class Lista2Exc5{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int numero;
    
    //ENTRADA
    
    System.out.println("Digite um numero");
    numero = ler.nextInt();
    
    
    //PROCESSAMENTO
    
    if(numero % 2 == 0 || numero % 3 == 0){
      
      if(numero % 2 == 0 && numero % 3 == 0){
        System.out.println("É divisível por 2 e por 3");
      }
      else if(numero % 2 == 0){
        System.out.println("É divisível por 2 e não é divisível por 3");
      }
      else if(numero % 3 == 0){
        System.out.println("É divisível por 3 e não é divisível por 2");
      }
    }
    
    
    else
      System.out.println("Não é divisível por 2 e nem por 3");
    
    
    
    
  }
}