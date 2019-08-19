package exc6;

import java.util.Scanner;

public class exc6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite um numero decimal:");
        int entrada = ler.nextInt();
        
        binario(entrada);
    }
    
    
    public static void binario (int decimal){
        Pilha p = new Pilha(10);
        String binario = "";
        
        while(decimal > 1) {
            
            String elemento = decimal % 2 + "";
            decimal /= 2;
            p.push(elemento);
            
            if(decimal == 1){
                elemento = decimal + "";
                p.push(elemento);
            }
        }
        
        while(!p.isEmpty()) {
            binario += p.pop();
        }
        
        System.out.println(binario);
    }
    
}
