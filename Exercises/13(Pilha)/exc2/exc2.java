package exc2;

public class exc2 {

    public static void main(String[] args) {
        String entrada = "((([])))";
        char pilha[] = new char[entrada.length()];
        int topo = -1;
        
        if(bemFormada(entrada, 0, topo, pilha))
            System.out.println("entrada "+entrada+" esta bem formada.");
        else
            System.out.println("entrada "+entrada+" NAO esta bem formada.");
    }

    private static boolean bemFormada(String entrada, int i, int topo, char pilha[]) {
        if( entrada.charAt(i) == '(' || entrada.charAt(i) == '['){
            topo++;
            pilha[topo] = entrada.charAt(i);
        }
        
        else if(entrada.charAt(i) == ')' || entrada.charAt(i) == ']'){
            if(topo == -1){
                return false;
            }
            
            char elemento = pilha[topo];
            topo--;
            
            if( elemento == '(' && entrada.charAt(i) != ')'){
                return false;
            }
            if( elemento == '[' && entrada.charAt(i) != ']'){
                return false;
            }
        }
        
        if(i == pilha.length-1 || topo != -1){
            return false;
        }
        else if(i < pilha.length-1 && topo > -1) {
            return bemFormada(entrada, i+1, topo, pilha);
        }
        else{
            return true;
        }
    }
}
