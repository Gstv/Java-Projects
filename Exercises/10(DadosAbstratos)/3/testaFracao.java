/**
 * Aplicação cliente que irá testar o TAD fracao
 * @author fabio.aglubacheski
 */
public class testaFracao {
    public static void main(String args[]){
        // cria uma variavel de referencia que irá
        // receber um vetor de objetos (Fracao)
        Fracao vetor[];
        
        // cria um vetor de objetos de 3 posicoes e atribui a varivel
        // vetor[]
        vetor =  new Fracao[3];
        System.out.println(vetor[0]);
        
        // cria um objeto fraco e atribui a primeira posicao do vetor [0]
        vetor[0] = new Fracao(1,2);
        vetor[1] = new Fracao(2,5);
        vetor[2] = new Fracao(3,2);
        System.out.println(vetor[0]);
        
        
    }
    
}
