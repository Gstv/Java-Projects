import java.util.Scanner;

public class Lista1Exc8{
  public static void main (String args []){
    
    int dependentes, salarioBruto, horas;
    Double descontoINSS, descontoIR, salarioLiquido;
    String nome;
        
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite seu nome completo:");
    nome = ler.nextLine();
    
    System.out.println("Digite a quantidade de horas trabalhadas:");
    horas = ler.nextInt();
    
    System.out.println("Digite o numero de dependentes de um funcionario(filhos):");
    dependentes = ler.nextInt();
    
   
    //PROCESSAMENTO
    
    salarioBruto = (horas * 12) + (dependentes * 40);
    descontoINSS = (salarioBruto * 0.085);
    descontoIR = (salarioBruto * 0.05);
    salarioLiquido = salarioBruto - (descontoINSS + descontoIR);
        
    
    
    //SAIDA
    System.out.println("Nome: "+nome);
    System.out.println("Salário Bruto eh de: "+ salarioBruto);
    System.out.printf("Desconto do INSS: %.2f\n", descontoINSS);
    System.out.printf("Desconto do Imposto de Renda: %.2f\n", descontoIR);
    System.out.printf("Salário Liquido eh de: %.2f\n", salarioLiquido);
        
    
        
  }
}
  