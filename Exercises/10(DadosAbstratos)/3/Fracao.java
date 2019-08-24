/**
 * Classe implementa o tipo abstrado de dados Fracao
 * @author fabio.aglubacheski
 */
public class Fracao {
    // atributos; 
    // private <tipo> <atributos>
    private int n, d;
    
    //definição de construtores...
    public Fracao(int n, int d)
    {
        // corpo do construtor
        this.n = n;
        this.d = d;
    }
    
    // calcula a soma de duas funcoes.
    // e retorna um novo objeto fracao com resultado da soma
    // metodo recebe duas fracoes como parametro
    // uma passada implicitamente e outra explicitamente
    // Soma de fração: (a/b)+(c/d)=( (a*d+c*b) / b*d )
    
    public Fracao soma(Fracao f)
    {
        //corpo do método
        //num = (a*d+c*b)
        int num = this.n*f.d+f.n*this.d;
        // den = b*d
        int den = this.d * f.d;
        
        return new Fracao(num,den);
        
    }
    //outros métodos e construtores .....

    @Override
    public String toString() {
        return n + "/" + d;
    }
    
    
}
