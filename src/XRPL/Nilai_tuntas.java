/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XRPL;

import java.util.Scanner;

/**
 *
 * @author ASUS E203N
 */
public class Nilai_tuntas {
    public static void main (String [] args){
        //membuat variabel nilai dan scanner
        
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        
        System.out.println("Masukkan nama siswa :");
        nama=scan.nextLine();
        
        System.out.println("MAsukkan nilai siswa :");
        nilai=scan.nextInt();
        
        //cek apakah nilai nya gagal
        if(nilai<=60){
            System.out.println("Siswa dinyatakan gagal");
        }
        
    }
    
}
