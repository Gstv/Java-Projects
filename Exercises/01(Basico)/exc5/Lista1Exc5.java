import java.util.Scanner;

public class Lista1Exc5{
  public static void main (String args []){
    
    int valorA, valorB, valorC, valorD, diferenca;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite o valor A: ");
      valorA = ler.nextInt();
    
    System.out.println("Digite o valor B: ");
      valorB = ler.nextInt();
    
    System.out.println("Digite o valor C: ");
      valorC = ler.nextInt();
    
    System.out.println("Digite o valor D: ");
      valorD = ler.nextInt();
      
      
    //PROCESSAMENTO
      
     
    diferenca = (valorA * valorB)-(valorC * valorD); 
    
    
    
    //SAIDA
    
    System.out.println(diferenca);
      
      
  }
}