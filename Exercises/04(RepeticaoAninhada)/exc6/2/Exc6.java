package lista4;

public class Exc6 {

    public static void main(String[] args) {
        
        int i=0, j=0, n=1;
        
        while(i < 10){
            while(j < n){
                System.out.print(j+"  ");
                j++;
            }
            System.out.println();
            i++;
            n++;
            j=0;
        }
    }
    
}
