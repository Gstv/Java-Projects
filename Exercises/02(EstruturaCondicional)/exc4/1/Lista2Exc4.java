import java.util.Scanner;

public class Lista2Exc4{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int A, B, C;
    
    //ENTRADA
    
    System.out.println("Digite o numero1");
    A = ler.nextInt();
    
    System.out.println("Digite o numero2");
    B = ler.nextInt();
    
    System.out.println("Digite o numero3");
    C = ler.nextInt();
        
    //PROCESSAMENTO
    
    if (A > B && A > C){
      if(B > C)
        System.out.println(C+""+B+""+A);
      
      else
        System.out.println(B+""+C+""+A);
    }
    else if (B > A && B > C){
      if(A > C)
        System.out.println(C+""+A+""+B);
      
      else
        System.out.println(A+""+C+""+B);
    }
    else if (C > A && C > B){
      if(A > B)
        System.out.println(B+""+A+""+C);
      
      else
        System.out.println(A+""+B+""+C);
    }
    
  }
}
    
