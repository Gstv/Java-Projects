package lista2;

import java.util.Scanner;

//@author Gustavo
 
public class exc1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int num;
        
        num = ler.nextInt();
        
        if(num % 2 == 0){
            System.out.println("É par");
        }
        else{
            System.out.println("Impar");
        }
    }
    
}
