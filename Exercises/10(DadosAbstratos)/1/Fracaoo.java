package tad;

public class Fracaoo {
    
    private int num; //a
    private int den; //b
    
    public Fracaoo(int a, int b){
        num = a;
        den = b;
    }
    
     public String toString(){
        return this.num + "/" + this.den;
    }
    
    public Fracaoo soma(Fracaoo f2){
        int numNovo, denNovo;
        
        //den = (a*d+c*b)
        //num = (b*d)
        
        numNovo = this.num * f2.den + f2.num * this.den;
        denNovo = this.den * f2.den;
        Fracaoo novaFracao = new Fracaoo (numNovo, denNovo);
        
        return novaFracao;
    }
    
    public Fracaoo multiplica(Fracaoo f2){
        int numNovo, denNovo;
        
        //den = (a*c)
        //num = (b*d) 
         
        numNovo = this.num * f2.num;
        denNovo = this.den * f2.den;
        Fracaoo novaFracao = new Fracaoo (numNovo, denNovo);
         
        return novaFracao;
    }
    
    public Fracaoo divisao(Fracaoo f2){
        Fracaoo outraInvertida, novaFracao;
        
        outraInvertida = new Fracaoo( f2.den, f2.num);
        
        novaFracao = this.multiplica(outraInvertida); //É o mesmo que: f1.multiplica(f2 invertida)
        return novaFracao;
    }
    
    public boolean igual(Fracaoo f2){
        //(a/b) == (c/d) se a*d == b*c
        return this.num * f2.den == this.den*f2.num;
    }
    
    
}
