import java.util.Scanner;

public class Lista5Exc4{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    String resultado; 
    int num;
    
    num = ler.nextInt();
    
    resultado = primo(num);
    System.out.println(resultado);
  }
  public static String primo( int numX){
    String result; 
    int repet=1, temp=0;
    
    while(repet <= numX){
      if(numX % repet == 0)
        temp++;
      repet++;
    }
    if(temp == 2)
      result="True";
    else
      result="False";
    
    return result;
  }
}    