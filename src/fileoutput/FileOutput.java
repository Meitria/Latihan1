/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main (String[] args){
     try {
         FileOutputStream fos = new FileOutputStream("D:/java.txt");
         String teks = "saya belajar operasi pada java dikelas XII RPL 2";
         byte[]isi =teks.getBytes();
         fos.write(isi);
     }
     catch(Exception e){
         System.err.println("Terjadi kesalahan saat menulis file");
         
     }
    }
}
