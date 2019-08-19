import java.util.Scanner;

public class Lista3Exc14{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int n, m, repet=0, result=0;
    
    //ENTRADA
    
    System.out.println("Digite o valor de n");
    n = ler.nextInt();
    
    System.out.println("Digite o valor de m");
    m = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(m > repet){
      result = result + n;
      repet++;
     }
    
    
    System.out.printf("O valor da multiplicação é: %d", result);
    
  }
}