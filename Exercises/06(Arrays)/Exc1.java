package exc1;

/**
 * @author Gustavo
 */
public class Exc1 {
    public static void main(String[] args) {
        int A[] = {7,2,5,8,4}, B[] = {4,2,9,5};
        String result;
                
        result = interseccao(A, B);
        System.out.println(result);
    }
    public static String interseccao (int vetorA[], int vetorB[]){
        String result="";
        
        //Pega um número do vetorA e vai comparando com os do vetorB, se for igual, result recebe o numero
        for(int i=0; i < vetorA.length; i++)
            for(int f=0; f < vetorB.length; f++)
                if(vetorA[i] == vetorB[f])
                    result+= vetorA[i]+" ";
        
        return result;
    }
}
