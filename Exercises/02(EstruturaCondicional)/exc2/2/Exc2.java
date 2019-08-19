package lista2;

import java.util.Scanner;

//@author Gustavo
 
public class Exc2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int num;
        
        num = ler.nextInt();
        
        if(num % 7 == 0){
            System.out.println("É multiplo");
        }
        else{
            System.out.println("não é");
        }
    }
    
}
