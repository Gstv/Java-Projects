import java.util.Scanner;

public class Lista1Exc12{
  public static void main (String args []){
    
    int minutoInicial, minutoFinal, horaInicial, horaFinal, duracaoHora, duracaoMinuto;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Insira a hora inicial do jogo(Minímo de 1 Hora)");
      horaInicial = ler.nextInt();
    
    System.out.println("Insira o minuto inicial do jogo");
      minutoInicial = ler.nextInt();
    
    System.out.println("Insira a hora final do jogo(Até 24 horas)");
      horaFinal = ler.nextInt();
    
    System.out.println("Insira o minuto final do jogo(Até 59 minutos)");
      minutoFinal = ler.nextInt();
    
    
    //PROCESSAMENTO
    
    duracaoHora = horaFinal - horaInicial;
    duracaoMinuto = minutoFinal - minutoInicial;
    
    
    //SAIDA
    
    System.out.printf("O JOGO DUROU: %d hora(s) e %d minuto(s).", duracaoHora, duracaoMinuto);
    
    
  }
}