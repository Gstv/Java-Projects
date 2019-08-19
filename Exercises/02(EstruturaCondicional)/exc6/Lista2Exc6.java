import java.util.Scanner;

public class Lista2Exc6{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int taxa, selo3, selo5;
    
    //ENTRADA
    
    System.out.println("Digite o valor da taxa, no minímo oito centavos:");
    taxa = ler.nextInt();
    
    //PROCESSAMENTO
    
    if(taxa % 5 == 0){
      selo5= taxa / 5; 
      System.out.printf("Precisa-se de %d selos de 5 centavos", selo5);
    }
    else if(taxa % 5 == 1){
      selo5= taxa / 5;
      selo5--;
      selo3= 2;
      System.out.printf("Precisa-se de %d selos de 5 centavos, e %d selos de 3 centavos", selo5, selo3);
    }
    else if(taxa % 5 == 2){
      selo5= taxa / 5;
      selo5= selo5 - 2;
      selo3= 4;
      System.out.printf("Precisa-se de %d selos de 5 centavos, e %d selos de 3 centavos", selo5, selo3);
    }
    else if(taxa % 5 == 3){
      selo5= taxa / 5;
      selo3= 1;
      System.out.printf("Precisa-se de %d selos de 5 centavos, e %d selos de 3 centavos", selo5, selo3);
    }
    else if(taxa % 5 == 4){
      selo5= taxa / 5;
      selo5--;
      selo3= 3;
      System.out.printf("Precisa-se de %d selos de 5 centavos, e %d selos de 3 centavos", selo5, selo3);
    }
    
    
    
    
    
  }
}
    