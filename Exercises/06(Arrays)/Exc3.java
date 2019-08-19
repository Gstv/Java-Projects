package exc1;

/**
 * @author Gustavo
 */
public class Exc3 {
    public static void main (String args []){
        int A[]={7,2,5,8,4}, B[]={4,2,9,5};
        
        System.out.println(diferenca(A, B));
    }
    
    public static String diferenca (int vetorA[], int vetorB[]){
        String result="";
        
        //printa vetor A
        for(int i=0; i < vetorA.length; i++)
            result+= vetorA[i] + " ";
        
        //acha a diferenca de B para A e printa    
        for(int j=0; j < vetorB.length; j++){
            boolean achou=false;
            
            for(int i=0; i < vetorA.length; i++)
               if(vetorB[j] == vetorA[i])
                   achou = true;
            
            if(achou == false)
                result+= vetorB[j] + " ";
        }
        return result;        
    }
}
