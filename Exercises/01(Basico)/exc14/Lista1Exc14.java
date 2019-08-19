import java.util.Scanner;

public class Lista1Exc14{
  public static void main (String args []){
    
    double a, b, maiorAB;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite o valor de A:");
    a = ler.nextDouble();
    
    System.out.println("Digite o valor de B:");
    b = ler.nextDouble();
    
    //PROCESSAMENTO
    
    maiorAB= (a + b + Math.abs(a - b)) /2;
    
    
    System.out.println("Maior numero lido eh: "+ maiorAB);
    
    
  }
}