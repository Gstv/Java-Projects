import java.util.Scanner;

public class Lista2Exc12{
  public static void main (String args []){
    Scanner ler = new Scanner (System.in);
    
    String palavra1, palavra2, palavra3, animal="";
    
    //ENTRADA
    
    System.out.println("O animal é vertebrado ou invertebrado?");
    palavra1 = ler.nextLine();
    
    System.out.println("O animal é uma ave, mamífero, inseto ou anelideo?");
    palavra2 = ler.nextLine();
    
    System.out.println("O animal é carnivoro, onivoro, herbivoro, hematofago?");
    palavra3 = ler.nextLine();
    
    //PROCESSAMENTO
    
    if(palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("carnivoro"))
      animal= "aguia";
    
    else if(palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("onivoro"))
      animal= "pomba";
    
    else if(palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("onivoro"))
      animal= "homem";
    
    else if(palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("herbivoro"))
      animal= "vaca";
    
    else if(palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("hematofago"))
      animal= "pulga";
    
    else if(palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("herbivoro"))
      animal= "lagarta";
    
    else if(palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("hematofago"))
      animal= "sanguessuga";
    
    else if(palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("onivoro"))
      animal= "minhoca";
    
    else
      animal= "desconhecido";
    
    //SAIDA
    
    System.out.println("O animal eh: "+ animal);
    
    
   
    
    
    
  }
}