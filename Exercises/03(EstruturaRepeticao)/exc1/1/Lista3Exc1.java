import java.util.Scanner;

public class Lista3Exc1{
  public static void main (String args []){
    Scanner ler = new Scanner(System.in);
    
    int valor=1, repet=0, cincoValores=5, guarda=valor, maior=valor, menor=valor, guarda2=valor;
    double media=0;
    
    //PROCESSAMENTO
      
      
    while(cincoValores > repet){
      System.out.println("Digite um valor");
      valor = ler.nextInt();
      
      if(valor >= guarda){//Achar maior número
        if(valor > maior)
          maior = valor;
           
        else if(valor < maior)
          maior = maior + 0;
          
      }
      
      if(valor <= guarda && valor <= guarda2){//Achar menor número
        if(menor > valor)
        menor = valor;
      }
      if(repet == 0){
        if(valor >= 1)
          menor = valor;
    }
      if(repet == 1){
        if(valor < guarda)
          menor = valor;
    }
      
      media = media + valor;
      guarda2 = guarda;
      guarda = valor;
      repet++;  
    }
    
    //SAIDA
    
    System.out.printf("O maior valor é: %d", maior);
    
    System.out.printf("\nO menor valor é: %d", menor);
    
    System.out.printf("\nA média aritmética é: %.1f", media/5);
    
  }
}