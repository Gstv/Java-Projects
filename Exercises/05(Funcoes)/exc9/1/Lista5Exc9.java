import java.util.Scanner;

public class Lista5Exc9{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num, resultado;
    
    num = ler.nextInt();
    
    resultado = verifica(num);
    System.out.println(resultado);
  }
  public static int verifica( int binario){
    int result=0, pot2=1;
    
    while(binario != 0){
      result+= (binario % 10) * pot2;
      binario/= 10;
      pot2*= 2;
    }
    return result;
  }
}
      
    
    