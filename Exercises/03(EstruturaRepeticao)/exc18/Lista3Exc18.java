import java.util.Scanner;

public class Lista3Exc18{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num, repet=0;
    double x=1, y=60, soma, result=0;
    
    //ENTRADA
    
    System.out.println("Digite um número natural");
    num = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(num > repet){
      soma = x / y;
      result = result + soma;
      
      x = x + 3;
      y = y - 5;
      repet++;
    }
    
    System.out.printf("O resultado da soma é: %.2f", result);
  }
}