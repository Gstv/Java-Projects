package exc3;

public class exc3 {
    public static void main(String[] args) {
        String entrada = "MANDA A REAL PRA ELES HAHAH.";
        
        inverte(entrada);
    }

    private static void inverte(String entrada) {
        Pilha p = new Pilha(entrada.length());
        
        String guarda[] = entrada.split(" ");
        String novaEntrada= "";
        
        for (int i = 0; i < guarda.length; i++) {
            for (int j = 0; j < guarda[i].length(); j++) {
                if(guarda[i].charAt(j) != '.'){
                    p.push(guarda[i].charAt(j));
                }
            }
            
            for (int j = 0; j < guarda[i].length(); j++) {
                novaEntrada += p.pop();
                if(p.isEmpty()){
                    break;
                }
            }
            
            if(i == guarda.length-1){
                novaEntrada += ".";
            }
            novaEntrada += " ";
        }
        
        System.out.println(novaEntrada);
    }
    
}