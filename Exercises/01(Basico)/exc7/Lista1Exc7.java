import java.util.Scanner;

public class Lista1Exc7{
  public static void main (String args []){
    
    double volume, densidade, massa;
    
    Scanner ler = new Scanner (System.in);
    
    
    //ENTRADA
    
    System.out.println("Digite a massa do objeto, em gramas:");
      massa = ler.nextDouble();
    
    System.out.println("Digite a densidade do objeto, em g/cm³:");
      densidade = ler.nextDouble();
      
      
    //PROCESSAMENTO
      
    volume = massa/densidade;
        
    
    //SAIDA
    
    System.out.printf("O volume do obejto eh: %.2f", volume);
    System.out.printf(" cm³");
    
    
      
  }
}