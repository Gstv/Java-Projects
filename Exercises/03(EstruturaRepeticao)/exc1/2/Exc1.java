package lista3;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int num, i=0, maior=0, menor=0;
        
        while(i < 5){
            num = ler.nextInt();
            
            if(i==0){
                maior = num;
                menor = num;
            }
            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
            
            i++;
        }
        System.out.println(maior+" e "+menor);
    }
    
}
