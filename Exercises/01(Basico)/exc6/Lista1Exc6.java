import java.util.Scanner;

public class Lista1Exc6{
  public static void main (String args []){
    
    int Area, Base, Altura;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite o valor da Base do tringulo");
      Base = ler.nextInt();
    
    System.out.println("Digite o valor da Altura do tringulo");
      Altura = ler.nextInt();
      
      
    //PROCESSAMENTO
    
    Area = (Base * Altura)/2;
    
    
    //ENTRADA
    
    System.out.println("A Area do tringulo eh: "+ Area);
    
    
  }
}