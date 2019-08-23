package exer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author gustavo.aasantos3
 */
public class Exc6 {
    public static void main(String[] args) {
        Exc6Jogador jogadorOut = new Exc6Jogador();
        Exc6Jogador jogadorIn = null;
        
        
        try{
            OutputStream out = new FileOutputStream("SavedGame.txt");
            ObjectOutputStream o = new ObjectOutputStream(out);
            o.writeObject(jogadorOut);
            o.close();
            
            InputStream in = new FileInputStream("SavedGame.txt");
            ObjectInputStream i = new ObjectInputStream(in);
            jogadorIn = (Exc6Jogador) i.readObject();
            System.out.println("Nome: " +  jogadorIn.getNome() + "\nfase: "+ jogadorIn.getFase() + "\npontos: "+ jogadorIn.getPontos());
            i.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }
    
}
