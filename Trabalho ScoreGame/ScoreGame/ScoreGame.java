
public class ScoreGame {
        
        public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
                
                int Score[] = new int[100];
                int opcao, qtd = 0, i, posicao, confere, count = 0;
                boolean vdd = false;
                
                while (count == 1) {
                        
                        System.out.println("1. Adicionar uma pontuacao no final da lista de scores");
                        
                        System.out.println("2. Adicionar uma pontuacao em uma dada posicao na lista de scores");
                        
                        System.out.println("3. Remover uma pontuacao de uma dada posicao na lista de scores");
                        
                        System.out.println("4. Remover todas as ocorrencias de uma pontuacao na lista de scores");
                        
                        System.out.println("5. Verificar se uma pontuacao esta contida lista de scores");
                        
                        System.out.println("6. Buscar a maior pontuacao na lista de scores");
                        
                        System.out.println("7. Calcular a soma total de pontuacao na lista de scores");
                        
                        System.out.println("8. Verificar se dado uma pontuacao existem duas pontuacoes na lista de scores que \n    somadas sao iguais a  pontuacao informada. ");
                        
                        System.out.println("0. Encerra programa");
                        
                        opcao = ler.nextInt();
                        
                        switch (opcao) {
                                
                                case 1:
                                        if (qtd <= 99) {
                                        System.out.println("Digite o valor da pontuacao");
                                        Score[qtd] = ler.nextInt();
                                        qtd++;
                                } else {
                                        System.out.println("Nao foi possivel adicionar");
                                }
                                for (i = 0; i < qtd; i++) {
                                        System.out.println("Score[" + i + "] = " + Score[i]);
                                }
                                break;
                                
                                case 2:
                                        System.out.println("Digite a posicao em que deseja adicionar");
                                        posicao = ler.nextInt();
                                        if (posicao >= 0 && posicao <= qtd) {
                                                for (i = qtd - 1; i >= posicao; i--) {
                                                        Score[i + 1] = Score[i];
                                                }
                                                System.out.println("Digite o valor da pontuacao");
                                                Score[posicao] = ler.nextInt();
                                                qtd++;
                                        } else {
                                                System.out.println("Posicao invalida");
                                        }
                                        for (i = 0; i < qtd; i++) {
                                                System.out.println("Score[" + i + "] = " + Score[i]);
                                        }
                                        break;
                                        
                                case 3:
                                        System.out.println("Digite a posicao em que deseja remover");
                                        
                                        posicao = ler.nextInt();
                                        
                                        if (posicao >= 0 && posicao <= qtd) {
                                                Remove(Score, qtd, posicao);
                                                qtd--;
                                        } else {
                                                System.out.println("Posicao invalida");
                                        }
                                        for (i = 0; i < qtd; i++) {
                                                System.out.println("Score[" + i + "] = " + Score[i]);
                                        }
                                        break;
                                        
                                case 4:
                                        int ponto;
                                        System.out.println("Digite a pontuacao que deseja remover");
                                        ponto = ler.nextInt();
                                        for (i = 0; i <= qtd; i++) {
                                                if (Score[i] == ponto) {
                                                        Remove(Score, qtd, i);
                                                        qtd--;
                                                }
                                        }
                                        for (i = 0; i < qtd; i++) {
                                                System.out.println("Score[" + i + "] = " + Score[i]);
                                        }
                                        break;
                                        
                                case 5:
                                        System.out.println("Digite a pontuacao que deseja verificar");
                                        
                                        confere = ler.nextInt();
                                        System.out.println(Verifica(Score, qtd, confere)); 
                                        
                                        for (i = 0; i < qtd; i++) {
                                                System.out.println("Score[" + i + "] = " + Score[i]);
                                        }
                                        break;
                                        
                                case 6:
                                        System.out.println("Maior pontuacao = " + Maior(Score, qtd));
                                        for (i = 0; i < qtd; i++) {
                                                System.out.println("Score[" + i + "] = " + Score[i]);
                                        }
                                        break;
                                        
                                case 7:
                                        System.out.println("Soma das pontuacoes = " + Soma(Score, qtd));
                                        for (i = 0; i < qtd; i++) {
                                                System.out.println("Score[" + i + "] = " + Score[i]);
                                        }
                                        break;
                                        
                                case 8:
                                        confere = ler.nextInt();
                                        for (i = 0; i < qtd; i++) {
                                                for (int j = 0; j < qtd; j++) {
                                                        if (Score[ j ] + Score[ i ] == confere &&  j  != i ) {
                                                                vdd = true;
                                                        }
                                                }
                                        }
                                        
                                        if (vdd == true) {
                                                System.out.println("Sim");
                                                vdd = false;
                                        } else {
                                                System.out.println("Nao");
                                        }
                                        for (i = 0; i < qtd; i++) {
                                                System.out.println("Score[" + i + "] = " + Score[i]);
                                        }
                                        break;
                                        
                                case 0:
                                        count++;
                                        break;
                                        
                                default:
                                        System.out.println("Opcao invalida.");
                                        break;
                        }
                }
        }
        
        public static int Soma(int v[], int elementos) {
                
                int soma = 0;
                for (int i = 0; i < elementos; i++) {
                        soma += v[i];
                }
                return soma;
        }
        
        public static void Remove(int v[], int elementos, int pos) {
                
                for (int i = pos; i < elementos - 1; i++) {
                        v[i] = v[i + 1];
                }
        }
        
        public static int Maior(int v[], int elementos) {
                
                int max = 0;
                for (int i = 0; i < elementos; i++) {
                        if (v[i] > max) {
                                max = v[i];
                        }
                }
                return max;
        }
        
        public static boolean Verifica(int v[], int elementos, int entrada) {
                
                for (int i = 0; i < elementos; i++) {
                        if (v[i] == entrada) {
                                return true;
                        }
                }
                return false;
        }
}
