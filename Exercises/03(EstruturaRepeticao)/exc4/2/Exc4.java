package lista3;

import java.util.Scanner;

public class Exc4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int n, impar=1;
        
        n = ler.nextInt();
        
        while(n != 0){
            System.out.print(impar+" ");
            
            impar+=2;
            n--;
        }
    }
    
}
