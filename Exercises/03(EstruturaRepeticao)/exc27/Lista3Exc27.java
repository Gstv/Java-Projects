import java.util.Scanner;

public class Lista3Exc27{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int maior, num=1, mod;
    
    //ENTRADA
    
    System.out.println("Digite um n�mero natural");
    maior = ler.nextInt();
    
    System.out.println("Digite um n�mero natural n�o nulo");
    mod = ler.nextInt();
    
    //PROCESSAMENTO
    
    while(maior > num){
      if(num % mod == maior % mod){
        System.out.printf("%d � congruente de m�dulo %d a %d\n", num, mod, maior);
      }
        num++;
    }
    
  }
}
        
      