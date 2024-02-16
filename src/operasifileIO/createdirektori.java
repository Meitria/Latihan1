/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasifileIO;

import java.io.File;

/**
 *
 * @author ASUS E203N
 */
public class createdirektori {
    public static void main (String []args){
        File folder = new File (" C:/belajar");
        // cek direktori ada atau belum kalau belum baru dibuat
        if (!folder.exists()){
            folder.mkdir();
            System.out.println("direktori berhasil dibuat");
        }else{
            System.out.println("direktori sudah ada");
        }
    }
}
