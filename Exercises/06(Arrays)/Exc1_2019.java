package listaFunVet;

public class Exc1 {
    public static void main(String[] args) {
        
        int vetorA[] = {7,2,5,8,4};
        int vetorB[] = {4,2,9,5}; 
        
        System.out.println(interseccao(vetorA, vetorB));
    }
    
    public static String interseccao (int a[], int b[]){
        String result="";
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                
                if(a[i] == b[j]){
                    result += a[i] + " ";
                }
            }
        }
        
        return result;
    }
}


