import java.util.Scanner;

public class Lista2Exc7{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    int precoProduto, escolha, desconto1, desconto2, juros;
    
    //ENTRADA 
    
    System.out.println("Insira o preço do produto");
    precoProduto = ler.nextInt();
    
    System.out.println("Escolha a forma de pagamento:");
    
    System.out.println("1. À vista em dinheiro ou cheque, recebe 10% de desconto");
    System.out.println("2. À vista no cartão de crédito, recebe 5% de desconto");
    System.out.println("3. Em 2 vezes, preço normal de etiqueta sem juros");
    System.out.println("4. Em 3 vezes, preço normal de etiqueta mais juros de 10%");
    escolha = ler.nextInt();
    
    
    //PROCESSAMENTO
    
    if(escolha == 1){
      desconto1 = precoProduto * 10/100;
      precoProduto = precoProduto - desconto1;
      System.out.printf("Pagando à vista em dinheiro ou cheque, deverá ser pago: R$ %d", precoProduto);
    }
    
    else if(escolha == 2){
      desconto2 = precoProduto * 5/100;
      precoProduto = precoProduto - desconto2;
      System.out.printf("Pagando à vista no cartão de crédito, deverá ser pago: R$ %d", precoProduto);
    }
    
    else if(escolha == 3){
      System.out.printf("Pagando em 2 vezes, deverá ser pago, sem juros, no total: R$ %d", precoProduto);
    }
    
    else if(escolha == 4){
      juros = precoProduto * 10/100;
      precoProduto = precoProduto + juros;
      System.out.printf("Pagando em 3 vezes, deverá ser pago: R$ %d", precoProduto);
    }
    
  }
}