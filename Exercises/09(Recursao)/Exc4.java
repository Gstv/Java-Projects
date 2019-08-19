package Recursividade;

public class Exc4 {
    public static void main(String[] args) {
        
        /*Implemente uma função recursiva para calcular a potência a sobre n, 
        supondo que tanto a quanto n sejam números inteiros positivos.*/
        int x=4, n=5;
        
        System.out.println(recursao(x, n));
    }
    
    public static int recursao (int x, int n){
        int result;
        
        if(n == 1){
            result = x;
        }
        else{
            result = x * recursao(x, n-1);
        }
        
        return result;
    }
    
}
