import java.util.Scanner;

public class Lista2Exc9{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    double num1, num2, num3;
    
    //ENTRADA
    
    System.out.println("Digite o primeiro número");
    num1 = ler.nextDouble();
    
    System.out.println("Digite o segundo número");
    num2 = ler.nextDouble();
    
    System.out.println("Digite o terceiro número");
    num3 = ler.nextDouble();
    
    //PROCESSAMENTO
    
    num1 = Math.pow(num1, 2);
    num2 = Math.pow(num2, 2);
    num3 = Math.pow(num3, 2);
    
    
    if( num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1){
       System.out.println("É uma tripla de Pitagoras");
  }
    else
       System.out.println("Não é uma tripla de Pitagoras");
    
    
    
  }
}