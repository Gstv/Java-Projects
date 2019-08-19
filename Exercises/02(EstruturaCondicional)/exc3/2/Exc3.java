package lista2;

import java.util.Scanner;

//@author Gustavo
 
public class Exc3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int numA, numB, numC;
        
        numA = ler.nextInt();
        numB = ler.nextInt();
        numC = ler.nextInt();
        
        if(numA < numB && numA < numC){
            System.out.println(numA);
        }
        else if(numB < numA && numB < numC){
            System.out.println(numB);
        }
        else{
            System.out.println(numC);
        }
        
    }
    
}
