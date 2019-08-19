import java.util.Scanner;

public class Lista2Exc1{
  public static void main (String args []){
    
    int numero;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite o numero:");
    numero = ler.nextInt();
    
    //PROCESSAMENTO
    
    if(numero % 2 ==0){
      System.out.println("O numero eh par");
    }
    
    else
      System.out.println("O numero eh impar");
      
       
  }
}