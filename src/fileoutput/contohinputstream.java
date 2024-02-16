/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoutput;

import java.io.FileInputStream;

/**
 *
 * @author user
 */
public class contohinputstream {
    public static void main(String[]args){
        try{
            FileInputStream fin=new FileInputStream("D:\\java.txt");
            int i=fin.read();
            System.out.print((char)i);
            fin.close();
            
        }catch(Exception e){System.out.println(e);}
    }
}
