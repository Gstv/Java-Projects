import java.util.Scanner;

public class Lista5Exc13{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num;
    double resultado;
    
    num = ler.nextInt();
    
    resultado = soma(num);
    System.out.println(resultado);
  }
  public static double soma( int x){
    double result=0, a=1, b=1;
    int repet=1;
    
    while(repet <= x){
      result+= (a / b);
      
      if(repet==1)
        b--;
      
      repet++;
      a+= repet;
      b+= 2;
    }
    return result;
  }
}
      
    
    