import java.util.Scanner;

public class Lista3Exc13{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num, result=1;
    
    //ENTRADA
    
    System.out.println("Digite um número inteiro natural");
    num = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(num > 1){
      result = result * num;
      num--;
    }
      
    System.out.printf("O resultado o fatorial é: %d", result);
    
  }
}
                       
                       
                         
    