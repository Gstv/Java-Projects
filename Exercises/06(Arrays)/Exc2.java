package exc1;

/**
 * @author Gustavo
 */
public class Exc2 {
    public static void main (String args []){
        int A[] = {7,2,5,8,4}, B[] = {4,2,9,5};
                
        System.out.println(diferenca(A, B));
    }
    public static String diferenca (int vetorA[], int vetorB[]){
        String result="";
        
        //Pega um número do vetorA e vai comparando com os do vetorB, se for diferente, aumenta o temp
        //Se temp = o tamanho do vetorB, então result recebe o numero
        for(int i=0; i < vetorA.length; i++)
            for(int f=0, temp=0; f < vetorB.length; f++)
                if(vetorA[i] != vetorB[f]){
                    temp++;
                    if(temp == vetorB.length)
                        result+= vetorA[i]+" ";
                }
        return result;
    }
}
