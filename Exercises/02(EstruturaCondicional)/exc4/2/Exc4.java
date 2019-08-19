package lista2;

import java.util.Scanner;

//@author Gustavo
 
public class Exc4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int num1, num2, num3, numA, numB, numC;
        
        num1 = ler.nextInt();
        num2 = ler.nextInt();
        num3 = ler.nextInt();
        
        //Maior
        if(num1 > num2 && num1 > num3){
            numA = num1;
        }
        else if(num2 > num1 && num2 > num3){
            numA = num2;
        }
        else{
            numA = num3;
        }
        
        //Menor
        if(num1 < num2 && num1 < num3){
            numC = num1;
        }
        else if(num2 < num1 && num2 < num3){
            numC = num2;
        }
        else{
            numC = num3;
        }
        
        //Meio
        if(numA != num1 && numC != num1){
            numB = num1;
        }
        else if(numA != num2 && numC != num2){
            numB = num2;
        }
        else{
            numB = num3;
        }
        
        System.out.println(numC+" e "+numB+" e "+numA);
    }
    
}
