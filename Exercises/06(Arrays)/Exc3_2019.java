package listaFunVet;

public class Exc3 {
    public static void main(String[] args) {
        
        int vetorA[] = {3,8,11};
        int vetorB[] = {2,6,1}; 
        
        System.out.println(uniao(vetorA, vetorB));
    }
    
    public static String uniao (int a[], int b[]){
        String result="";
        
        for (int i = 0; i < a.length; i++) {
            result += a[i] + " ";
        }
        
        for (int i = 0; i < b.length; i++) {
            int cont=0;
            
            for (int j = 0; j < a.length; j++) {
                if(a[j] == b[i]){
                    cont++;
                }
            }
            
            if(cont == 0){
                result += b[i] + " ";
            }
        }
        
        return result;
    }
}