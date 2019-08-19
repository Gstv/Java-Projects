import java.util.Scanner;

public class Lista2Exc10{
  public static void main (String args []){
    Scanner ler = new Scanner(System.in);
    
    int a, b, c, solucao;
    double delta, x1, x2;
    
    //ENTRADA
    
    System.out.println("Digite o valor de A");
    a = ler.nextInt();
    
    System.out.println("Digite o valor de B");
    b = ler.nextInt();
    
    System.out.println("Digite o valor de C");
    c = ler.nextInt();
    
    //PROCESSAMENTO
    
    delta = (Math.pow(b, 2)) - 4 *(a * c);
    
    
    if(delta >= 0){
      x1 = -b + (Math.sqrt(delta)); 
      x1 = x1 / (2*a);
      x2 = -b - Math.sqrt(delta);
      x2 = x2 / (2*a);
      System.out.println("A solução é: "+x1+", "+x2 );
    }
    
    else if(delta < 0)
      System.out.println("Impossível calcular" );
   
    
  }
}
    