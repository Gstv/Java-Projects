import java.util.Scanner;

public class Lista3Exc5{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num, repet=0, result=0, soma=1;
    
    //ENTRADA
    
    System.out.println("Digite um n�mero:");
    num = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(num > repet){
      result = result + soma;
      
      soma += 2;
      repet++;
      
    }
    
    System.out.printf("O resultdo de %d ao quadrado �: %d", num, result);
    
  }
}