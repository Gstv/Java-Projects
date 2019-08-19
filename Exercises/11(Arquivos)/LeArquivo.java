package learquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Abre um arquivo e atribui o objeto de leitura
        //a uma variavel da classe FileReader
        FileReader arquivo;
        arquivo = new FileReader("arquivo.txt");
        // Para fazer a leitura bufferizada utilizaremos
        // a classe BufferedReader
        BufferedReader objBufferizado;
        objBufferizado=new BufferedReader(arquivo);
        
        String linha, vetorString[];
        
        linha = objBufferizado.readLine();
        System.out.println(linha);
        // quebra uma String separada por espacos
        vetorString = linha.split(" ");
        linha = objBufferizado.readLine();
        System.out.println(linha);
        
        linha = objBufferizado.readLine();
        System.out.println(linha);
        
        System.out.println(vetorString[1]);
    }
    
}
