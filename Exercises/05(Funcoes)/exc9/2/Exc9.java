package lista6;

import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        String binario;
        
        binario = ler.nextLine();
        System.out.println(conversao(binario));
    }
    
    public static int conversao (String b){
        int result=0, exp = b.length()-1;
        String v[] = b.split("");
        
        for (int i=0; i < v.length; i++, exp--) {
            int temp = (int) Math.pow(2, exp);
            result+= Integer.parseInt(v[i]) * temp;
            
        }
        return result;
    }
}
