/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Dell
 */
public class contoh_thread {   
    public static void main(String[] args) {
        int jumlah = 10;
        Thread thread = new Thread(){
            public void run(){
                try{
                    for(int w=1; w<=jumlah; w++){
                        System.out.println("Nomor: "+w);
                        sleep(1000); //Waktu Pending
                    }
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
    

