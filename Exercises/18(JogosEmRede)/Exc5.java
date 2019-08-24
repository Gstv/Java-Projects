package exer;

import java.io.*; 

public class Exc5{
    public static void main( String args[]){
        double doubleOut = 2.589; 
        int inteitoOut = 50;
        double doubleln = 0; 
        int inteiroln = 0;
 
        try{
            OutputStream out = new FileOutputStream("configuracao.txt");
            DataOutputStream o = new DataOutputStream(out);
            o.writeDouble(doubleOut);
            o.writeInt(inteitoOut);
            o.close();
            
            InputStream in = new FileInputStream("configuracao.txt");
            DataInputStream i = new DataInputStream(in);
            doubleln = i.readDouble();
            inteiroln = i.readInt();
            System.out.println("Conteudo " + doubleln + " e " + inteiroln);
            i.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
    }
}
