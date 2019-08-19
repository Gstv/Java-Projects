import java.util.Scanner;

public class Lista1Exc1{
  public static void main (String args []){
    
    int numero, num1, num2, num3, temp;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite o numero");
    numero = ler.nextInt();
    
    

    //PROCESSAMENTO
    
    num1 = numero /100;
    temp = numero %100;
    num2 = temp /10;
    num3 = temp %10;
    
    
    // SAIDA
    
    System.out.println(num3 +""+ num2 +""+ num1);
    
    
    
       
    
  }
}