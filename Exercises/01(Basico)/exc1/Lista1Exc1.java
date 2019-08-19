import java.util.Scanner;

public class Lista1Exc1{
  public static void main (String args []){
    
    int numero, num1, temp;
    Scanner ler = new Scanner (System.in);
    
    
    //ENTRADA
    
    System.out.println("Digite o numero");
    numero = ler.nextInt();
    
    
    //PROCESSAMENTO
    
    temp = numero %100;
    numero = numero /100;
    num1 = temp %10;
    
    
    //ENTRADA
    
    System.out.println(numero+""+num1);
    
  
  }
}