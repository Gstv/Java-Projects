package exer;

import java.io.*;

public class Exc3 { 
    public static void main(String[] args) { 
        String msgOut = "Eu tenho menos de 100 bytes"; 
        byte[] msgIn = new byte[100];
        
        try {
            OutputStream out = new FileOutputStream("Pedra.txt");
            out.write(msgOut.getBytes());
            out.close();

            InputStream in = new FileInputStream("Pedra.txt");
            in.read(msgIn);
            System.out.println("Conteudo  do arquivo: " + new String(msgIn));
            in.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    } 
}