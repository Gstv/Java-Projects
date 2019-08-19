import java.util.Scanner;

public class Lista3Exc11{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int taxa, selo5=0, selo3=0;
    
    //ENTRADA
    
    System.out.println("Digite o valor da taxa");
    taxa = ler.nextInt();
    
    //PROCESSAMENTO
    
    if(taxa % 5 == 0){
      selo5 = taxa / 5;
    }
    else if(taxa % 5 == 1){
      selo5 = (taxa / 5) -1;
      selo3 = 2;
    }
    else if(taxa % 5 == 2){
      selo5 = (taxa / 5) -2;
      selo3 = 4;
    }
    else if(taxa % 5 == 3){
      selo5 = (taxa / 5);
      selo3 = 1;
    }
    else if(taxa % 5 == 4){
      selo3 = (taxa / 3);
    }
    System.out.printf("Selos de cinco: %d \nSelos de três: %d", selo5, selo3);
  }
}
      