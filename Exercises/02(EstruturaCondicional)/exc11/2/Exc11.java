package lista2;

//@author Gustavo

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int x, y;
        
        x = ler.nextInt();
        y = ler.nextInt();
        
        if(x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if(x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if(x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if(x > 0 && y < 0){
            System.out.println("Q4");
        }
        else if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if(x > 0 && y == 0){
            System.out.println("Eixo X");
        }
        else if(x == 0 && y < 0){
            System.out.println("Eixo Y");
        }
    }
    
}
