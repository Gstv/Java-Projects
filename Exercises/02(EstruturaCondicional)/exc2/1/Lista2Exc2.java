import java.util.Scanner;

public class Lista2Exc2{
  public static void main (String args []){
    
    int numero;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite o numero:");
    numero = ler.nextInt();
    
    //PROCESSAMENTO
    
    if(numero %7 == 0){
      System.out.println("É divisivel por 7");
    }
      
    else
      System.out.println("Nao eh divisivel por 7");
    
    
  }
}