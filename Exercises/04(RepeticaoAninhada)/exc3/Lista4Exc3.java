import java.util.Scanner;

public class Lista4Exc3{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int N, M, repet=0, repet2=0;
    
    //ENTRADA
    
    System.out.println("Digite o valor de N");
    N = ler.nextInt();
    
    System.out.println("Digite o valor de M");
    M = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(M > repet){
      
      while(N > repet2){
        System.out.print("* ");
        repet2++;
      }
      System.out.println();
      repet2=0;
      repet++;
    }
  }
}