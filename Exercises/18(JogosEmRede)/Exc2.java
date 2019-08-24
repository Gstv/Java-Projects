/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author gustavo.aasantos3
 */
public class Exc2 {
     public static void main(String[] args) { 
         String msgOut = "Novo recorde: Jogador 1"; 
         byte[] msgIn = new byte[100];
        
         try{
            OutputStream out = new FileOutputStream("teste.txt");
            out.write(msgOut.getBytes());
            out.close();

            InputStream in = new FileInputStream("teste.txt");
            in.read(msgIn);
            System.out.println("Conteudo do arquivo: "+ new String(msgIn));
            in.close();
        } catch (Exception e){
            System.err.println(e);
        }
    
    }
}
