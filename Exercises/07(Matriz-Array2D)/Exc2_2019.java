package AulaMatriz;

public class Exc2_2019 {
    public static void main(String[] args) {
        
        int matriz[][] = {{0,6},{-1,2},{5,0}};
        
        System.out.println(maior(matriz));
    }
    
    public static int maior (int m[][]){
        int result=0;
        
        for (int i=0; i < m.length; i++) {
            for (int j=0; j < m[0].length; j++) {
                if(m[i][j] > result){
                    result = m[i][j];
                }
            }
        }
        return result;
    }
    
}
