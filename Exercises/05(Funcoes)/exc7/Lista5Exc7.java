import java.util.Scanner;

public class Lista5Exc7{
  public static void main (String args []){
    Scanner ler = new Scanner(System.in);
    
    int num, resultado;
    
    num = ler.nextInt();
    
    resultado = fatorial(num);
    System.out.println(resultado);
  }
  public static int fatorial( int n){
    int result=1, repet=0;
    
    while(repet < n){
      result*= n;
      n--;
    }
    return result;
  }
}
    