/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Dell
 */
public class contoh_queue {
    public static void main (String args[]){
        //membuat dan menginisialisasi interface queue menggunakan objek linked list
        Queue<String> antriTiket = new LinkedList();
       //menambahkan data
       antriTiket.add("Anggga");
       antriTiket.add("Indah");
       antriTiket.add("Sekar");
       antriTiket.add("Rudi");
       antriTiket.add("Rena");
       antriTiket.add("Novi");
       //Menampilkan output dari Queue
       System.out.println("Antrian Tiket Peserta : "+antriTiket);
       //Method remove() akan melempar NoSuchException, jika list queue kosong
       String nama = antriTiket.remove();
       System.out.println("Menghapus antrian Tiket : "+nama+"|daftar antrian baru:"+antriTiket);
       //Menghapus sebuah elemen dari queue menggunakan method poll() dan method remove() akan mengembalikan null
       nama=antriTiket.poll();
       System.out.println("Menghapus antrian Tiket : "+nama+"|daftar antrian baru:"+antriTiket);
    }
    
}
