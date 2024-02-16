/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class File_baru {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("Membuat File dengan java");
        System.out.println("Masukkan nama File : ");
        String namafile= in.nextLine();
 System.out.println("Masukkan tipe extensi untuk file"+namafile+":");
        String eksfile=in.nextLine();
        try{
            String path = "D:\\java.txt"+namafile+"."+eksfile;
            File f = new File(path);
            f.createNewFile();
            System.out.println("Pembuatan file berhasil");
        }
        catch(IOException ex){
            System.out.println("Pembuatan file gagal");
            
        }
    }
    
}
