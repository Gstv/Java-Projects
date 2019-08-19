import java.util.Scanner;

public class Lista3Exc2{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int menor=0, maior=0, num=0, repet=0;
    
    //PROSESSAMENTO
    
    while(repet >= 0){
      System.out.println("Insira um número:");
      num = ler.nextInt();
      
      if(repet == 0){
        menor = num;
        maior = num;
      }
      else{
      if(num > maior)
        maior = num;
        
      if(num < menor && num >= 0)//O num >= 0 serve apenas para tirar o num negativo do menor numero
        menor = num;
      }
      if(num < 0)
        repet = -2;
    
    repet++;
  }
    
    System.out.printf("O maior número é: %d\nO menor número é: %d\n", maior, menor);
    
  }
}