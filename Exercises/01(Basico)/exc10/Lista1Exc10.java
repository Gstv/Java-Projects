import java.util.Scanner;

public class Lista1Exc10{
  public static void main (String args []){
    
    int horas, minutos, segundos;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Os segundos do evento da fábrica");
      segundos = ler.nextInt();
      
      
    //PROCESSAMENTO  
    
    minutos = (segundos /60)%60;  
    horas = segundos /3600;
    segundos = segundos %60;
    
    //SAIDA
    
    System.out.printf("%d Horas, %d Minutos, %d Segundos", horas, minutos, segundos);
    
    
  }
}