import java.util.Scanner;

public class Lista5Exc2{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num1, resultado;
    
    //PROCESSAMENTO
    
    num1 = ler.nextInt();
    
    resultado = soma(num1);
    System.out.println(resultado);
    
  }
  public static int soma( int x){
    int result=0, repet=0, temp=1;
    
    while(repet < x){
      result+= temp;
      temp+= 2;
      repet++;
    }
    return result;
  }
}