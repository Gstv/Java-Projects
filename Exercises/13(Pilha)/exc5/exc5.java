package exc5;

import exc3.Pilha;

public class exc5 {
    public static void main(String[] args) {
        String entrada = "abcba";
        
        if(formaCerta(entrada)){
            System.out.println("A palavra está certa");
        }
        else{
            System.out.println("Não está certa");
        }
    }
    
    public static boolean formaCerta (String entrada){
        Pilha p = new Pilha (entrada.length());
        
        String guarda[] = entrada.split("c");
        
        if(guarda.length != 2){
            return false;
        }
                
        for (int i = 0; i < guarda[0].length(); i++) {
            if(guarda[0].charAt(i) == 'a' || guarda[0].charAt(i) == 'b'){
                p.push(guarda[0].charAt(i));
            }
        }
        for (int j = 0; j < guarda[1].length(); j++) {
            if(p.isEmpty()){
                return false;
            }
            
            char elemento = p.pop();
            
            if(elemento != guarda[1].charAt(j)){
                return false;
            }
        }
            
        if(!p.isEmpty())
            return false;
        
        return true;
    }
    
}
