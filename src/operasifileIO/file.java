/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasifileIO;

import java.io.FileOutputStream;

/**
 *
 * @author ASUS E203N
 */
public class file {
    public static void main (String [] args){
        try{
            FileOutputStream fos = new FileOutputStream ("D:/java.txt");
            String teks ="saya belajar operasi file pada java";
            byte[] isi = teks.getBytes();
            fos.write(isi);
            fos.close();
            }
        catch(Exception e ){
            System.out.println("terjadi kesalahan saat menulis teks");
        }
    }

    
    
}
