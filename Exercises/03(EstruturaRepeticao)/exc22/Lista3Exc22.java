public class Lista3Exc22{
  public static void main (String args []){
    
    int repet=0;
    double soma=0, x=2, x2=5, y=500, y2=250;
    
    //PROCESSAMENTO
    
    while(5 > repet){
      soma = soma + (x / y);
      soma = soma - (x2 / y2);
      y -= 100;
      y2 += 100;
      repet++;
    }
    System.out.println(soma);
  }
}
      
        
      
    