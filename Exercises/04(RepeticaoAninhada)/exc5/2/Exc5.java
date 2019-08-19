package lista4;

public class Exc5 {

    public static void main(String[] args) {
        
        int i=0, j=0;
        
        while(i < 10){
            while(j < 10){
                System.out.print(i+"  ");
                j++;
            }
            System.out.println();
            i++;
            j=0;
        }
    }
    
}
