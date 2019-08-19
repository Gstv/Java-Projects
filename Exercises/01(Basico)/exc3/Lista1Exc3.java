import java.util.Scanner;

public class Lista1Exc3{
  public static void main (String args []){
    
    double NotaA, NotaB, NotaC, Media;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite a Nota A, de 0 a 10:");
    NotaA = ler.nextDouble();
    
    System.out.println("Digite a Nota B, de 0 a 10:");
    NotaB = ler.nextDouble();
    
    System.out.println("Digite a Nota C, de 0 a 10:");
    NotaC = ler.nextDouble();
    
    
    //PROCESSAMENTO
    
    NotaA = NotaA * 2;
    NotaB = NotaB * 3;
    NotaC = NotaC * 5;
    Media = (NotaA + NotaB + NotaC) /10;
    
    
    //SAIDA
     
    System.out.println("A Media foi de: "+ Media);
    
    
    
  }
}