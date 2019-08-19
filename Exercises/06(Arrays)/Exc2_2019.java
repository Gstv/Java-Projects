package listaFunVet;

public class Exc2 {
    public static void main(String[] args) {
        
        int vetorA[] = {7,2,5,8,4};
        int vetorB[] = {4,2,9,5}; 
        
        System.out.println(diferenca(vetorA, vetorB));
    }
    
    public static String diferenca (int a[], int b[]){
        String result="";
        
        for (int i = 0; i < a.length; i++) {
            int cont=0;
            
            for (int j = 0; j < b.length; j++) {
                
                if(a[i] == b[j]){
                    cont++;
                }
            }
            if(cont == 0){
                result += a[i] + " ";
            }
        }
        return result;
    }
}