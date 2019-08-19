import java.util.Scanner;

public class Lista1Exc13{
  public static void main (String args []){
    
    int x, y, z, medidaTotal, litrosTinta, materialRolo, custoTotal, materialTinta, materialTotal, maoDeObra;
    
    Scanner ler = new Scanner (System.in);
    
    //ENTRADA
    
    System.out.println("Digite as medidas do lado x");
    x = ler.nextInt();
    
    System.out.println("Digite as medidas do lado y");
    y = ler.nextInt();
    
    System.out.println("Digite as medidas do lado z");
    z = ler.nextInt();
    
    //PROCESSAMENTO
    
    medidaTotal= ((x*y)+(x*y))+((y*z)+(y*z))+((x*z)+(x*z));
    litrosTinta = medidaTotal * 3;
    materialRolo = (medidaTotal / 10) * 5;
    materialTinta = (litrosTinta / 5) * 45;
    materialTotal = materialTinta + materialRolo;
    maoDeObra = (medidaTotal * 20);
    custoTotal = maoDeObra + materialTinta + materialRolo;
    
    
    //ENTRADA
    
    System.out.printf("Medida total: %dm², %d litros de tinta necessarios.\n", medidaTotal, litrosTinta); 
    System.out.printf("%d custo total( %dR$ mao de obra + %dR$ material)", custoTotal, maoDeObra, materialTotal);
    
        
  }
}