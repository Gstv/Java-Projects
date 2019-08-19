import java.util.Scanner;

public class Lista3Exc7{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int maior=0, posicao=1, repet=1, num;
    
    //PROCESSAMENTO
    
    while(repet <= 10){
      System.out.println("Digite um valor inteiro:");
      num = ler.nextInt();
      
      if(repet == 1){
        maior = num;
        posicao = repet;  
      }
      else if(num > maior){
        maior = num;
        posicao = repet;
      }
      
      repet++;
    }
    
    System.out.printf("O maior valor lido é: %d, posição: %d", maior, posicao);
        
 }
}