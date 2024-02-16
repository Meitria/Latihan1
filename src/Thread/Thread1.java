/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author ASUS E203N
 */
public class Thread1 {
    int angka;
    String namaThread;
    
    
    public Thread1(String nama){
        angka=0;
        namaThread=nama;
    }
     public void run(){
         try{
             do{
                 Thread.sleep(2000);
                 System.out.println("di"+namaThread+"angka ke-"+angka);
                 angka++;
             }while (angka<100);
            }catch (InterruptedException e ){
                System.out.println("error!");
         }
    }
}
