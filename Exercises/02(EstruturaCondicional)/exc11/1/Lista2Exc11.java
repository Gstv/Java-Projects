import java.util.Scanner;

public class Lista2Exc11{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    Double x, y;
    
    //ENTRADA
    
    System.out.println("Digite o valor de x");
    x = ler.nextDouble();
    
    System.out.println("Digite o valor de y");
    y = ler.nextDouble();
    
    //PROCESSAMENTO
    
    if(x > 0 && y > 0){
      System.out.println("O ponto est� no quadrante Q1");
    }
    else if(x < 0 && y > 0){
      System.out.println("O ponto est� no quadrante Q2");
    }
    else if(x < 0 && y < 0){
      System.out.println("O ponto est� no quadrante Q3");
    }
    else if(x > 0 && y < 0){
      System.out.println("O ponto est� no quadrante Q4");
    }
    else if(x > 0 && y == 0){
      System.out.println("O ponto est� no Eixo X");
    }
    else if(x == 0 && y > 0){
      System.out.println("O ponto est� no Eixo Y");
    }
    else
      System.out.println("O ponto est� na Origem");
    
    
  }
}