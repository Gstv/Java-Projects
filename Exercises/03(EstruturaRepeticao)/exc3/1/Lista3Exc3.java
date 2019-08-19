import java.util.Scanner;

public class Lista3Exc3{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    double result=0;
    int x, n;
    
    //ENTRADA
    
    System.out.println("Digite o valor de X");
    x = ler.nextInt();
    
    System.out.println("Digite o valor de N");
    n = ler.nextInt();
    
    //PROCESSAMENTO
    
    result = Math.pow(x, n);
    
    System.out.println(result);
  }
}
    
    