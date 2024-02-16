
package Thread;
import static java.lang.Thread.sleep;
public class latihan_thread_implements_Runnable {
       int jumlah = 10;
    public static void main(String[] args) {
        latihan_thread test = new latihan_thread();
        test.proses_satu();
    }
    public void run() {
       try{
          for(int w=1; w<=jumlah; w++){
            System.out.println("ID: "+w);
            sleep(1000); //Waktu Pending
          }
       }catch(InterruptedException ex){
              ex.printStackTrace();
       }
    }
}

    

