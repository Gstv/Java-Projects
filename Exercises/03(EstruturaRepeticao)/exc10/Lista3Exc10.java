import java.util.Scanner;

public class Lista3Exc10{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int n1, n2, temp, repet=0;
    
    //ENTRADA
    
    System.out.println("Digite o valor de N1");
    n1 = ler.nextInt();
    
    System.out.println("Digite o valor de N2");
    n2 = ler.nextInt();
    
    //PROCESSAMENTO
    
    repet = n1;
    
    while(n2 >= repet){
      if(n1 == 2 || n1 == 3 || n1 == 5 || n1 == 7 || n1 == 11)
        System.out.print(n1+",");
      
      else if(n1 != 1 && n1 % 2 > 0 && n1 % 3 > 0 && n1 % 5 > 0 && n1 % 7 > 0 && n1 % 11 > 0){
          System.out.print(n1+",");
      }
      n1++;
      repet++;
    }
    
  }
}
      
      