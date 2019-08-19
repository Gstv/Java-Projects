package AulaMatriz;

public class Exc1_2019 {
    public static void main(String[] args) {
        
        int matriz[][] = {{0,6},{-1,2},{5,0}};
        int matrizT[][] = transposta(matriz);
        
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                System.out.print(matrizT[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    public static int[][] transposta (int m[][]){
        int mt[][] = new int [m[0].length][m.length];
        
        for (int i=0; i < m[0].length; i++) {
            for (int j=0; j < m.length; j++) {
                mt[i][j] = m[j][i];
            }
        }
        return mt;
    }
    
}
