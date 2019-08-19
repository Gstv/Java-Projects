import java.util.Scanner;

public class Lista3Exc17{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num, temp, cont=1, num6=0, num5=0, num4=0, num3=0, num2=0, num1=0;
    
    //ENTRADA
    
    System.out.println("Digite um número natural com mais de dois dígitos:");
    num = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(num != 0){
      temp = num % 10;
      num /= 10;
      
      if(cont == 1){
        num1 = temp;
      }
      if(cont == 2){
        num2 = temp;
      }
      if(cont == 3){
        num3 = temp;
      }
      if(cont == 4){
        num4 = temp;
      }
      if(cont == 5){
        num5 = temp;
      }
      if(cont == 6){
        num6 = temp;
      }
      else if(num != 0){
        cont++;
      }
    }
    if(cont == 2 && num1 == num2){
      System.out.println("É palíndromo");
    }
    else if(cont == 3 && num1 == num3){
      System.out.println("É palíndromo");
    }
    else if(cont == 4 && num1 == num4 && num2 == num3){
      System.out.println("É palíndromo");
    }
    else if(cont == 5 && num1 == num5 && num2 == num4){
      System.out.println("É palíndromo");
    }
    else if(cont == 6 && num1 == num6 && num2 == num5 && num3 == num4){
      System.out.println("É palíndromo");
    }
    else
      System.out.println("Não é palíndromo!");
    
      
      
  }
}
      
      
      
      
      