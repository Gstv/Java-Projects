import java.util.Scanner;

public class Lista1Exc9{
  public static void main (String args []){
    
    int minutos, horas;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA 
    
    System.out.println("Digite os minutos:");
      minutos = ler.nextInt();
    
    
    //PROCESSAMENTO
    
    horas = minutos /60;
    minutos = minutos %60;
    
    //SAIDA
    
    System.out.printf("Horas %d e %d Minutos\n", horas, minutos);
    
    
    
  }
}