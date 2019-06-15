package campominadogustavo;

import java.util.Scanner;
import java.util.Random;

// @author GUSTAVO ANDRÉ DE ALMEIDA SANTOS - Jogos Digitais 2º Semestre
public class CampoMinadoGustavo {
    public static void main(String[] args) {
        
        game();
    }
    
    public static void game(){
        
        Scanner ler = new Scanner (System.in);
        
        char M[][] = initialize();
        char G[][] = tabuleiroGamer(M);
        int jogoAtivo= -1, linha, coluna, acao;
        
        while(jogoAtivo == -1 || jogoAtivo == 1){ // -2 = BUG, -1 = CONTINUA, 0 = DERROTA, 1 = MARCA, 2 = VENCE
            
            print(G, M, jogoAtivo);
            
            System.out.println("\nInsira os números da posicao que deseje abrir (linha, coluna):");
            linha = ler.nextInt();
            coluna = ler.nextInt();
            System.out.println("Insira a ação que deseja fazer: ");
            System.out.println("1 - Revelar \n2 - Marcar/Desmarcar");
            acao = ler.nextInt();
            
            jogoAtivo = step(M, G, linha, coluna, acao);
            
            if(jogoAtivo == -1){ //Abre posição
                    G[linha][coluna] = M[linha][coluna];
                    abreVazio(G, M, linha, coluna);
            }
            else if(jogoAtivo == 1){ //Marca posiçãp
                
                if(G[linha][coluna] == 'P')
                    G[linha][coluna] = '-';
                else
                    G[linha][coluna] = 'P';
            }
            else if(jogoAtivo == -2)
                System.out.println("Posição ou ação inválida! Jogue novamente utilizando uma posição valida no tabuleiro.");
            
            //verifica a vitória
            if(jogoAtivo != 0){
                if( status(G, M))
                    jogoAtivo = 2;
                else
                    jogoAtivo = -1;
            }
        }
        print(G, M, jogoAtivo);
        System.out.print("Jogo encerrado: ");
        
        if(jogoAtivo == 0)
            System.out.println("Havia uma mina! Você perdeu!");
        else if(jogoAtivo == 2)
            System.out.println("Você venceu!");
    }
    
    //DÁ UM TAMANHO DO TABULEIRO E QTD DE MINAS, PREENCHENDO COM AS DICAS E MINAS
    public static char [][] initialize(){
        Scanner ler = new Scanner (System.in);
        Random geradorMinas = new Random();
        char tabuleiroM[][] = null;
        int tam, qtdMinas=0;
        
        System.out.println("Escolha o tamanho do tabuleiro que deseja jogar:");
        System.out.println("1 - Iniciante \n2 - Intermediário \n3 - Profissional");
        tam = ler.nextInt();
        
        if(tam == 1){ //DEFINE TAMANHO DO TABULEIRO E BOMBAS
            tabuleiroM = new char [11][11];
            qtdMinas = 10;
        }
        else if(tam == 2){
            tabuleiroM = new char [18][18];
            qtdMinas = 40;
        }
        else if(tam == 3){
            tabuleiroM = new char [18][32];
            qtdMinas = 99;
        }
            
        for(int i=0; i < qtdMinas;){ // GERA MINAS ALEATÓRIAS PELO TABULEIRO
            int p1 = geradorMinas.nextInt(tabuleiroM.length);
            int p2 = geradorMinas.nextInt(tabuleiroM[0].length);
            if(p1 > 0 && p2 > 0 && p1 < tabuleiroM.length-1 && p2 < tabuleiroM[0].length-1 && tabuleiroM[p1][p2] != '*'){
                tabuleiroM[p1][p2] = '*';
                i++;
            }
        }
        
        for(int i=1; i < tabuleiroM.length-1; i++){ // DEFINE AS DICAS DO TABULEIRO
            for(int j=1; j < tabuleiroM[0].length-1; j++){
                if(tabuleiroM[i][j] != '*'){
                    int mina = procura(tabuleiroM, i, j);
                    if(mina == 0)
                        tabuleiroM[i][j] = '0';
                    else if(mina == 1)
                        tabuleiroM[i][j] = '1';
                    else if(mina == 2)
                        tabuleiroM[i][j] = '2';
                    else if(mina == 3)
                        tabuleiroM[i][j] = '3';
                    else if(mina == 4)
                        tabuleiroM[i][j] = '4';
                    else if(mina == 5)
                        tabuleiroM[i][j] = '5';
                    else if(mina == 6)
                        tabuleiroM[i][j] = '6';
                    else if(mina == 7)
                        tabuleiroM[i][j] = '7';
                    else if(mina == 8)
                        tabuleiroM[i][j] = '8';
                }
            }
        }
        return tabuleiroM;
    }
    
    //PROCURA MINAS EM VOLTA DA POSIÇÃO
    public static int procura(char tabuleiroM[][], int posI, int posJ){
        int mina=0;
        for(int i=posI-1; i <= posI+1; i++){
            for(int j=posJ-1; j <= posJ+1; j++){
                if(tabuleiroM[i][j] == '*'){
                    mina++;
                }
            }
        }
        return mina;
    }
    
    // FAZ TABULEIRO DO JOGADOR PREENCHENDO COM '-'
    public static char [][] tabuleiroGamer(char M[][]){
        char tabGamer[][] = new char [M.length][M[0].length];
        
        for(int i=1; i < tabGamer.length-1; i++)
            for(int j=1; j < tabGamer[0].length-1; j++)
                tabGamer[i][j]='-';
            
        return tabGamer;
    }
    
    // PRINTA TABULEIRO DO JOGADOR ATUALIZADO
    public static void print(char tabGamer[][], char M[][], int jogoAtivo){
        int mina=0, marca=0;
        //imprime bombas se perde
        if(jogoAtivo == 0){
            for(int i=1; i < tabGamer.length-1; i++)
                for(int j=1; j < tabGamer[0].length-1; j++)
                    if(M[i][j] == '*')
                        tabGamer[i][j] = M[i][j];
        }
        //imprime bandeiras se ganha
        else if(jogoAtivo == 2){
            for(int i=1; i < tabGamer.length-1; i++)
                for(int j=1; j < tabGamer[0].length-1; j++)
                    if(M[i][j] == '*')
                        tabGamer[i][j] = 'P';
        }
        //imprime numeros do j
        System.out.print("  ");
        for(int j=1; j < tabGamer[0].length-1; j++){
            if(j < 10)
                System.out.print("  "+j);
            else
                System.out.print(" "+j);
        }
        System.out.println();
        //imprime tabuleiro e qtd de minas
        for(int i=1; i < tabGamer.length-1; i++){ //imprime numeros do i
            if(i < 10)
                System.out.print(i+"  ");
            else
                System.out.print(i+" ");
            
            for(int j=1; j < tabGamer[0].length-1; j++){ //Imprime tab e acha mina e marca pra dar Qtd de minas restantes
                System.out.print("["+tabGamer[i][j]+"]");
                
                if(M[i][j] == '*')
                    mina++;
                else if(tabGamer[i][j] == 'P')
                    marca++;
            }
            System.out.println();
        }
        System.out.print("Minas: "+(mina-marca)+"\n");
    }
    
    // VERIFICA SE TEM MINA NA POSIÇÃO, CASO TENHA VC PERDE, VERIFICA SE A AÇÃO É VÁLIDA
    public static int step(char M[][], char tabGamer[][], int lin, int col, int acao){
        if(lin > 0 && lin < M.length-1 && col > 0 && col < M[0].length-1 && acao == 1 || acao == 2){
            if(acao == 2 && tabGamer[lin][col] != M[lin][col])
                return 1;
            
            else if(M[lin][col] != '*')
                return -1;
            
            else if(M[lin][col] == '*')
                return 0;
        }
        return -2;
    }
    
    // ABRE POSIÇÃO VAZIA
    public static void abreVazio(char tabGamer[][], char M[][], int lin, int col){
        if(M[lin][col] == '0'){
            if(M[lin][col] == '0' && tabGamer[lin][col-1] != '0'){ // LADO ESQUERDO
                tabGamer[lin][col-1] = M[lin][col-1];
                abreVazio(tabGamer, M, lin, col-1);
            }
            if(M[lin][col] == '0' && tabGamer[lin-1][col] != '0'){ // PARA CIMA
                tabGamer[lin-1][col] = M[lin-1][col];
                abreVazio(tabGamer, M, lin-1, col);
            }
            if(M[lin][col] == '0' && tabGamer[lin][col+1] != '0'){ // LADO DIREITO
                tabGamer[lin][col+1] = M[lin][col+1];
                abreVazio(tabGamer, M, lin, col+1);
            }
            if(M[lin][col] == '0' && tabGamer[lin+1][col] != '0'){ // PARA BAIXO
                tabGamer[lin+1][col] = M[lin+1][col];
                abreVazio(tabGamer, M, lin+1, col);
            }
            if(M[lin][col] == '0' && tabGamer[lin-1][col-1] != '0'){ // DIAGONAL ESUERDA CIMA
                tabGamer[lin-1][col-1] = M[lin-1][col-1];
                abreVazio(tabGamer, M, lin-1, col-1);
            }
            if(M[lin][col] == '0' && tabGamer[lin-1][col+1] != '0'){ // DIAGONAL DIREITA CIMA
                tabGamer[lin-1][col+1] = M[lin-1][col+1];
                abreVazio(tabGamer, M, lin-1, col+1);
            }
            if(M[lin][col] == '0' && tabGamer[lin+1][col+1] != '0'){ // DIAGONAL DIREITA BAIXO
                tabGamer[lin+1][col+1] = M[lin+1][col+1];
                abreVazio(tabGamer, M, lin+1, col+1);
            }
            if(M[lin][col] == '0' && tabGamer[lin+1][col-1] != '0'){ // DIAGONAL ESQUERDA BAIXO
                tabGamer[lin+1][col-1] = M[lin+1][col-1];
                abreVazio(tabGamer, M, lin+1, col-1);
            }
        }
    }
    
    // VERIFICA SE GANHOU, SE ABRIU TUDO MENOS AS MINAS, A SOMA VAI SER IGUAL AO TAMANHO DO TABULEIRO 
    public static boolean status(char tabGamer[][], char M[][]){
        int mina=0, vitoria=0, marca=0, tamTab= (tabGamer.length-2) * (tabGamer[0].length-2);
        
        for(int i=1; i < tabGamer.length-1; i++){
            for(int j=1; j < tabGamer[0].length-1; j++){
                if(M[i][j] == '*' && tabGamer[i][j] == '-' || tabGamer[i][j] == 'P')
                    mina++;
                if(tabGamer[i][j] == 'P' && M[i][j] != '*')
                    marca++;
                else if(tabGamer[i][j] != '-' && tabGamer[i][j] != 'P')
                    vitoria++;
            }
        }
        if(tamTab == (vitoria + mina - marca))
            return true;
        
        return false;
    }
}