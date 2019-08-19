package lista6;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        String num = ler.nextLine();
        
        System.out.println(palindromo(num));
    }
    
    public static int palindromo (String n){
        String v[] = n.split("");
        
        for (int i=0, j= v.length-1; i < j; i++, j--) {
            
            if(!v[i].equals(v[j])){
                return 0;
            }
        }
        return 1;
    }
}
