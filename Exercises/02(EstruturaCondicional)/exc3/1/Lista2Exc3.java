import java.util.Scanner;

public class Lista2Exc3{
  public static void main (String args []){
    
    int a, b, c, maior;
    
    Scanner ler = new Scanner (System.in);
    
    
    //ENTRADA
    
    System.out.println("Digite o valor de A:");
    a = ler.nextInt();
    
    System.out.println("Digite o valor de B:");
    b = ler.nextInt();
    
    System.out.println("Digite o valor de C:");
    c = ler.nextInt();
    
    
    //PROCESSAMENTO
    
    if(a > b && a > c){
        System.out.println(a+" eh o maior valor");
    }
       
    else if(b > a && b > c){
        System.out.println(b+" eh o maior valor");
    }
       
    else if(c > a && c > b){
        System.out.println(c+" eh o maior valor");
    }
    
    else
      System.out.println("Há numeros iguais");
       
        
  }
}