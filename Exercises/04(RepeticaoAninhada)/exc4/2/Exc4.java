package lista4;

public class Exc4 {

    public static void main(String[] args) {
        
        int i=0, j=0;
        
        while(i < 10){
            
            while(j < 10){
                System.out.print(j+"  ");
                j++;
            }
            System.out.println();
            i++;
            j=0;
        }
    }
    
}
