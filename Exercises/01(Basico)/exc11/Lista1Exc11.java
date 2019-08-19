import java.util.Scanner;

public class Lista1Exc11{
  public static void main (String args []){
    
    int dias, meses, anos;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite os dias:");
      dias = ler.nextInt();
      
      
    //PROCESSAMENTO
      
    anos = dias / 365;  
    meses = (dias % 365) /30;
    dias = (dias % 365) %30;
    
    
    //SAIDA
    
    System.out.printf("%d anos, %d meses, %d dias: ", anos, meses, dias);
    
    
    
    
  }
}