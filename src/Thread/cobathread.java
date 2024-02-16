/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author user
 */
 class cobathread implements Runnable {
    public void run(){
            System.out.println("thread anak dieksekusi");
        }
    }
class penerapanRunnable {
    public static void main (String[]args){
        cobathread obj= new cobathread();
        Thread t= new Thread(obj);
        t.start();
        System.out.println("thread utama dieksekusi");
        
    }
}

