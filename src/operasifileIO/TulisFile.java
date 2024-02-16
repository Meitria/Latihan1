
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasifileIO;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASUS E203N
 */
public class TulisFile {
    public static void main (String []args){
        String fileName =" D: /java.txt";
        String fileContent =" saya belajar operasi file pada java";
        try {
            FileWriter fileWriter=new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.close();
            
            System.out.println("File sudah di tulis ulang!");
        }
        catch (IOException e){
            System.out.println("Terjadi kesalahan");
            
        }
    }
    
}
