package tad;

public class fracao {
    public static void main(String[] args) {
        Fracaoo f1, f2;
        
        f1 = new Fracaoo(5,10); //instancio novo objeto
        f2 = new Fracaoo(1,2);
        
        //Soma de fracao:
        System.out.println("soma: "+f1.soma(f2));
        
        //Multiplicação de fracao
        System.out.println("mult: "+f1.multiplica(f2));
        
        //Divisao de fracao
        System.out.println("div: "+f1.divisao(f2));
        
        //Igualdade
        System.out.println("igualdade: "+ f1.igual(f2));
        
        System.out.println(f1);
    }
}
