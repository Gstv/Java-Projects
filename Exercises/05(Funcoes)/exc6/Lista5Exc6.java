import java.util.Scanner;

public class Lista5Exc6{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int resultado, num;
    
    num = ler.nextInt();
    
    resultado = soma(num);
    System.out.println(resultado);
  }
  public static int soma( int x){
    int result=0, repet=2, temp1=1, temp2=1;
    
    if(x < 3)
      result=1;
    else{
      while(repet < x){
      result = temp1 + temp2;
      temp1=temp2;
      temp2=result;
      repet++;
      }
    }
    return result;
  }
}