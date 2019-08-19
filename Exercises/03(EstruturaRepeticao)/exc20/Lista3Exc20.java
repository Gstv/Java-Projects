public class Lista3Exc20{
  public static void main (String args []){
    
    int repet=0;
    double soma=0, temp=0, num1=1, num2=1;
    
    //ENTRADA
    
    while(repet < 5){
      soma = soma + (num1 / num2);
      num1++;
      num2 = num1 * num1;
      temp = num1 / num2;
      soma = soma - temp;
      num1++;
      num2 = num1 * num1;
      repet++;
    }
    System.out.println(soma);
  }
}
      
      
      
          