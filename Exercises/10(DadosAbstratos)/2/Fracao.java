/*
 * Definindo um TAD fracao
 */
package testatad;

/**
 *
 * @author fabio.aglubacheski
 */
public class Fracao {
    // dados do tipo abstrato
    private int num; // a
    private int den; // b
    
    // definindo o construtor da classe Fracao
    // O constutor inicializa os atributos da classe
    // num e den com os valores informados por parâmetro
    // além o construtor deve ter o mesmo nome da classe
    // em resumo o construtor eh um trecho de codigo que
    // cria os objetos da classe a que ele pertence
    public  Fracao(int a, int b){
        num = a;
        den = b;
    }
    
    // operações do tipo abstrato
    // serão funções ou melhor
    // métodos (sem usar static)
    // definindo a primeira operação
    // Igualdade: (a/b) == (c/d) se a*d == b*c
    /*
    public <tipoDeRetorno> 
              <nomeDoMétodo>(<parâmetros>)
    	{
          //corpo do método
    	}
    */
    public boolean igual(Fracao outro){
        //(a/b) == (c/d) se a*d == b*c
        return this.num * outro.den == this.den*outro.num;
    }
    public String toString() {
        return this.num + "/" + this.den;
    } 
    // Soma de fração: 
    // (a/b)+(c/d)=( (a*d+c*b) / b*d )
    public Fracao soma(Fracao outra){
        //a==this.num b==this.den
        //c==outra.num d==outra.den
        int numNovo, denNovo;
        numNovo = this.num*outra.den+outra.num*this.den;
        denNovo = this.den*outra.den;
        Fracao novaFracao = new Fracao(numNovo, denNovo);
        return novaFracao;
        
    }
    // Multiplicação de fração: 
    // (a/b) * (c/d)= ( (a*c) / (b*d) )
    public Fracao multiplica(Fracao outra){
        //a==this.num b==this.den
        //c==outra.num d==outra.den
        int numNovo, denNovo;
        numNovo = this.num*outra.num;
        denNovo = this.den*outra.den;
        Fracao novaFracao = new Fracao(numNovo, denNovo);
        return novaFracao;
    }
    //Divisão de fração: 
    //(a/b) / (c/d) = (a/b)*(d/c) = (a*d) / (b*c)
    public Fracao divide(Fracao outra){
        //a==this.num b==this.den
        //c==outra.num d==outra.den
        Fracao outraInvertida, novaFracao;
        // inverte a segunda fracao
        // ou seja, c/d virou d/c
        outraInvertida = new Fracao( outra.den, outra.num);
        // para calcular a divisao basta usar a primeira fracao
        // multiplicada pela segunda fracao invertida
        // (a/b)*(d/c)
        novaFracao = this.multiplica(outraInvertida); //É o mesmo que: f1.multiplica(f2 invertida)
        return novaFracao;
    }
    
}
