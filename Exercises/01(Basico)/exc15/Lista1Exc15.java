import java.util.Scanner;

public class Lista1Exc15{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    Double p1, p2, x1, y1, x2, y2, distancia;
    
    //ENTRADA
    
    System.out.println("Valor de x1:");
    x1 = ler.nextDouble();
    
    System.out.println("Valor de x2:");
    x2 = ler.nextDouble();
    
    System.out.println("Valor de y1:");
    y1 = ler.nextDouble();
    
    System.out.println("Valor de y2:");
    y2 = ler.nextDouble();
    
    //PROCESSAMENTO
    
    p1= Math.pow((x2 - x1), 2);
    p2= Math.pow((y2 - y1), 2);
    distancia= Math.sqrt(p1 + p2);
    
    //SAIDA
    
    System.out.println("Raiz quadrada de: "+ (p1 + p2));
    System.out.printf("A distancia foi de: %.2f", distancia);
    
      
  }
}