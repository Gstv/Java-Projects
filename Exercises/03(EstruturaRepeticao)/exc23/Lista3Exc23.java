import java.util.Scanner;

public class Lista3Exc23{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int N, repet=0, num=1, soma=1;
    
    //ENTRADA
    
    System.out.println("Digite um número natural");
    N = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(N > repet){
      if(N-1 == repet){
        System.out.print(num+".\n");
        System.out.println("A soma deles é: "+soma);
      }
      else{
        System.out.print(num+",");
        num = (num + 2) + repet;
        soma = soma + num;
      }
      repet++;
    }
    
  }
}
      
      