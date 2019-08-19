import java.util.Scanner;

public class Lista5Exc11{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int resultado, num;
    
    num = ler.nextInt();
    
    resultado = verifica(num);
    if(resultado == num)
      System.out.println("eh palindromo");
    else
      System.out.println("nao eh palindromo");
  }
  public static int verifica( int x){
    int result=0;
    
    while(x > 0){
      result= result * 10 + (x % 10);
      x/= 10;
    }
    return result;
  }
}  