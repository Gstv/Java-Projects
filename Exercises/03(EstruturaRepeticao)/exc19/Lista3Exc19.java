import java.util.Scanner;

public class Lista3Exc19{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num, repet=1;
    double H=0, x=1, y=1;
    
    //ENTRADA
    
    System.out.println("Digite um número natural");
    num = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(num >= repet){
      H = H + (x / y);
      
      if(repet == 1){
        y--;
      }
      repet++;
      x += repet;
      y += 2;
    }
    System.out.printf("O valor de H é: %.2f", H);
  }
}
    