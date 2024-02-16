/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class arraylist1 {
    public static void main(String[] args){
        //Membuat Objek ArrayList dengan Tipe Data String
        List<String> mahasiswa = new ArrayList<>();
        //Menambahkan Data String pada Objek mahasiswa
        mahasiswa.add("halimah");
        mahasiswa.add("fadzilan");
        mahasiswa.add("raras");
        
        //Membuat Objek ArrayList dengan Tipe Data Integer
        List<Integer> nomor = new ArrayList<>();
        //Menambahkan Data Integer pada Objek nomor
        nomor.add(23);
        nomor.add(53);
        nomor.add(8);
        
        //Mencetak Nilai Satu Persatu dari Kedua Objek ArrayList
        System.out.println(mahasiswa.get(0));
        System.out.println(mahasiswa.get(1));
        System.out.println(mahasiswa.get(2));
        
        System.out.println(nomor.get(0));
        System.out.println(nomor.get(1));
        System.out.println(nomor.get(2));
        //Mencetak Nilai dari Kedua Objek sesuai dengan Posisi Index Array
    }
}


