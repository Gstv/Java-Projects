/*
 * Aplicação cliente
 */
package testatad;

public class TestaTAD {

    public static void main(String[] args) {
        // cria uma variavel para receber um objeto fracao
        // nome da classe (Fracao) nome da minha variavel objeto (f1)
        Fracao f1, f2, f3;
        
        // instancia (aloca, cria) o objeto fracao
        f1 = new Fracao(5,10);
        f2 = new Fracao(1,2);
        // verificar se as duas fracoes sao iguais
        System.out.println(f1.igual(f2));
        // testa a soma
        f3 = f1.soma(f2);
        System.out.println("soma="+f3);
        // testa multiplicao
        f3 = f1.multiplica(f2);
        System.out.println("mutiplicacao="+f3);
        // testa divisao
        f3 = f1.divide(f2);
        System.out.println("divisao="+f3);
        
       
        
        
    }
    
}

