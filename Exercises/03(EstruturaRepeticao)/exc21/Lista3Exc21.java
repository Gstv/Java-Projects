import java.util.Scanner;

public class Lista3Exc21{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num, repet=0;
    double soma=0, x=1, y=60;
    
    //ENTRADA
    
    System.out.println("Digite um número natural");
    num = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(num > repet){
      soma = soma + (x / y);
      x += 3;
      y -= 5;
      if(y <= 0){
        y = 1;
      }
      repet++;
    }
    System.out.println("Resultado: "+soma);
  }
}
      
    
    