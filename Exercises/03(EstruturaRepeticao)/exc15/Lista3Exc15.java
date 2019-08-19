import java.util.Scanner;

public class Lista3Exc15{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int binario, temp=0, potencia=1, result=0;
    //potencia guardara resultado de uma potencia de base 2 
    
    //ENTRADA
    
    System.out.println("Digite um número inteiro binário");
    binario = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(binario != 0){
      
      temp= binario % 10;
      binario = binario / 10;
      temp = temp * potencia;
      result += temp;
      
      if(potencia == 1){
        potencia++;
      }
      else
        potencia *= 2;
    }
    System.out.printf("O decimal é: %d", result);
  }
}
    
    