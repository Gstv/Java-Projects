import java.util.Scanner;

public class Lista3Exc16{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int decimal, temp=0, cont=1, num6=0, num5=0, num4=0, num3=0, num2=0, num1=0;
    
    //ENTRADA
    
    System.out.println("Digite um número natural:");
    decimal = ler.nextInt();
    
    //PROCESSAMENTO
    
    System.out.printf("O decimal %d convertido em binário é: ", decimal);
    
    while(decimal != 0){
      temp = decimal % 2;
      decimal /= 2;
      
      if(cont == 1){
        num1=temp;
      }
      if(cont == 2){
        num2=temp;
      }
      if(cont == 3){
        num3=temp;
      }
      if(cont == 4){
        num4=temp;
      }
      if(cont == 5){
        num5=temp;
      }
      if(cont >= 6){
        num6=temp;
      }
      else if(decimal != 0){
        cont++;
      }
     }
    
    if(cont == 2)
        System.out.print(num2+""+num1);
      
    if(cont == 3)
        System.out.print(num3+""+num2+""+num1);
      
    if(cont == 4)
        System.out.print(num4+""+num3+""+num2+""+num1);
      
    if(cont == 5)
        System.out.print(num5+""+num4+""+num3+""+num2+""+num1);
      
    if(cont == 6)
        System.out.print(num6+""+num5+""+num4+""+num3+""+num2+""+num1);
    
  }
}