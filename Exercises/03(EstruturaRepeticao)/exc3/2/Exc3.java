package lista3;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int x, n, i=0, result=1;
        
        x = ler.nextInt();
        n = ler.nextInt();
        
        while(i < n){
            result*=x;
            
            i++;
        }
        
        System.out.println(result);
        
    }
    
}
