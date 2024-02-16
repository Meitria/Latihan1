
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.list;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args){
        //Membuat Instance/Objek dari LinkedList
        LinkedList<String> buah = new LinkedList<>();
        
        //Menambahkan Data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");
       
        System.out.println(buah);
        
        //Mencetak/Menampilkan Data
        System.out.println("Nama Buah: "+buah);
        
        //Menghitung Jumlah/Ukuran pada Objek LinkedList
        System.out.println("Jumlah Buah: "+buah.size());
    }
}

    


