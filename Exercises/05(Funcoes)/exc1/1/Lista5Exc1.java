import java.util.Scanner;

public class Lista5Exc1{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int x, n, resultado;
    
    //ENTRADA
    
    System.out.println("Insira o valor de x");
    x = ler.nextInt();
    
    System.out.println("Insira o valor de n");
    n = ler.nextInt();
    
    resultado = soma (x, n);
    System.out.printf("O resultado %d", resultado);
    
  }
  public static int soma (int x1, int n1){
    int result=0, repet=1, resultMult=1;
    
    while(n1 > repet){
      resultMult = resultMult * x1;
      System.out.println(resultMult);
      result = resultMult;
      result = result * x1;
      System.out.println(result);
      
      repet++;
      
    }
    return result;
    
    
  }
}
    