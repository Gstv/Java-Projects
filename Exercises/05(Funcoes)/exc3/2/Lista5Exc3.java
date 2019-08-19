import java.util.Scanner;

public class Lista5Exc3{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int n1, n2, resultado;
    
    //ENTRADA
    
    System.out.println("Insira o valor de n1");
    n1 = ler.nextInt();
    
    System.out.println("Insira o valor de n2");
    n2 = ler.nextInt();
  
    resultado = soma (n1, n2);
    System.out.printf("O resultado eh: %d", resultado);
    
  }
  public static int soma (int n3, int n4){
    int result=1, repet=0, temp=0, cont=n3;
    
    while(cont > repet){
      
      
      if(n3 % 2 == 0){
        temp= temp + 2;
        result = result * temp;
      }
      else if(n3 % 3 == 0){
        temp= temp + 3;
        result = result * temp;
      }
      
      
      
    }
    return result;
    
    
  }
}
    