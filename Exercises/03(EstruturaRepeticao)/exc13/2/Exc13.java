package lista3;

import java.util.Scanner;

public class Exc14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int num, n, result=1, i=0;
        
        num = ler.nextInt();
        n = num;
        
        while(i < num){
            
            result *= n;
            
            n--;
            i++;
        }
        
        System.out.println(result);
    }
    
}
