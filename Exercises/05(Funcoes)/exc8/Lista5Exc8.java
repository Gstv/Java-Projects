import java.util.Scanner;

public class Lista5Exc8{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num1, num2, resultado;
    
    num1 = ler.nextInt();
    num2 = ler.nextInt();
    
    resultado = mult(num1, num2);
    System.out.println(resultado);
  }
  public static int mult( int n, int m){
    int result=0, repet=0;
    
    while(repet < m){
      result+= n;
      repet++;
    }
    return result;
  }
}