package gerencmemoriagustavo;

import java.util.Scanner;

/**
 * @author Gustavo André
 */

public class GerencMemoriaGustavo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira a memória que deseja testar:");
        int memoria = ler.nextInt();
        
        simulator(memoria, ler);
    }
    
    public static void simulator(int memoria, Scanner ler){
        ListaLigada objLivres = new ListaLigada();
        ListaLigada objAlocados = new ListaLigada();
        
        int acao=0, processo=0;
        
        objLivres.addInicio(memoria);
        
        while(acao != 4){
            System.out.println("\nMemória livre:");
            objLivres.printLivres();
            
            System.out.println("\nMemória alocada:");
            objAlocados.printAlocados();
            
            System.out.println("\nO que deseja fazer?\n1 - Iniciar novo processo\n2 - Encerrar processo\n3 - Finalizar simulador");
            acao = ler.nextInt();
            
            if(acao == 1){
                System.out.println("Informe o Nº do processo:");
                processo = ler.nextInt();
                
                while(objAlocados.buscaProcesso(processo)){
                    System.out.println("[ERRO] - Nº do processo inválido!");
                    processo = ler.nextInt();
                }
                
                System.out.println("Quantidade de memória necessária do processo:");
                memoria = ler.nextInt();
                
                if(objLivres.statusMemoria(memoria)){
                    objAlocados.addFim(processo, memoria, objLivres);
                    objLivres.melhorBloco(memoria);
                    System.out.println("Processo foi alocado com sucesso!");
                }
                else{
                    System.out.println("\n[ERRO] - Não há espaço na memória!");
                }
            }
            
            else if(acao == 2){
                System.out.println("Informe o Nº do processo que deseja remover:");
                processo = ler.nextInt();
                
                if(objAlocados.buscaProcesso(processo)){
                    objLivres.addLivres(processo, objAlocados);
                    objAlocados.remOrdenado(processo);
                    objLivres.memoriaContigua();
                    System.out.println("Processo removido com sucesso!");
                }
                else{
                    System.out.println("\n[ERRO] - Processo inexistente!");
                }
            }
            
            else if(acao == 3){
                break;
            }
        }
    }
    
}
