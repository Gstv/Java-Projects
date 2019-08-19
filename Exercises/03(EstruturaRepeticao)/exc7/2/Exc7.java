package lista3;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int num, i=0, maior=0, posicao=0;
        
        while(i < 10){
            num = ler.nextInt();
            
            if(i == 0){
                maior = num;
            }
            else if(num > maior){
                maior = num;
                posicao = i+1;
            }
            
            i++;
        }
        
        System.out.println(maior+" na posicao "+posicao);
    }
    
}
