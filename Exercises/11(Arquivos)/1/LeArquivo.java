/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author fabio.aglubacheski
 */
public class LeArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /* 1o Passo
           O arquivo texto devera estar na pasta do projeto 
           exemplo, se o projeto chama-se LeArquivo em
           \leArquivo\teste.txt
        */
        
        /* 2o Passo
          devemos primeiramente abrir o arquivo, no Java temos várias
          classes para manipular um arquivo, para esse exemplo usaremos
          a classe FileReader
        */
        FileReader arquivo = new FileReader("teste.txt");
        
        /* 3o Passo
          agora iremos ler as informacoes dentro do arquivo, para ler uma linha 
          inteira no arquivo usarei a classe BufferedReader, que faz a leitura
          bufferizada, por exemplo a linha toda de um arquivo 
        */
        BufferedReader arquivoBufferizado = new BufferedReader(arquivo);
        
        // le uma linha do arquivo
        System.out.println(arquivoBufferizado.readLine());
        System.out.println(arquivoBufferizado.readLine());
        System.out.println(arquivoBufferizado.readLine());
        System.out.println(arquivoBufferizado.readLine());
        System.out.println(arquivoBufferizado.readLine());
        System.out.println(arquivoBufferizado.readLine());
        
        /* 4o passo
          Como separar as informacoes em uma linha (String) ??
          Isso eh por conta de vocês.
        */
        
        
        System.out.println("ufa cheguei até tudo bem !!");
      
    }
    
}
