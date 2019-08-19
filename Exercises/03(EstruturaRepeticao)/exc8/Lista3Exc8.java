import java.util.Scanner;

public class Lista3Exc8{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int num1, num2, maior, menor, resto, result=0, temp=1;
    
    //ENTRADA
    
    System.out.println("Digite o valor do primeiro número");
    num1 = ler.nextInt();
    
    System.out.println("Digite o valor do segundo número");
    num2 = ler.nextInt();
    
    //PROCESSAMENTO
    
    if(num1 > num2){
      maior = num1;
      menor = num2;
    }
    else{
      maior = num2;
      menor = num1;
    }
    
    resto = maior % menor;
    
    if(resto == 0){
      result = menor;
    }
    
    else{
      
    while(temp != 0){
      temp = menor % resto;
      menor = resto;
      
      result = resto;
      resto = temp;
     }
    
    }
    
    System.out.printf("O máximo dividor comum de %d e %d é: %d", num1, num2, result);
    
  }
}