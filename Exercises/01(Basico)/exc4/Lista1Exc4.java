import java.util.Scanner;

public class Lista1Exc4{
  public static void main (String args []){
    
    int ValorA, ValorB, temp1;
    
    Scanner ler = new Scanner (System.in);
    
    
    //ENTRADA
    
    System.out.println("Digite o Valor A");
    ValorA = ler.nextInt();
    
    System.out.println("Digite o Valor B");
    ValorB = ler.nextInt();
    
    
    //PROCESSAMENTO
    
    temp1 = ValorA;
    ValorA = ValorB;
    ValorB = temp1;
        
    
    //SAIDA
    
    System.out.println("Valor de A: "+ ValorA+"\nValor de B: "+ValorB);
    
    
    
  }
}