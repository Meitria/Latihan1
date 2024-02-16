package operasifileIO;

import java.io.FileOutputStream;

public class Modul {
    public static void main(String[] Args) {
        try {
            FileOutputStream fos = new FileOutputStream ("D:\\Data Pribadi.txt");
            String nama ="Halima Tussakdiyah";
            byte[]isi=nama.getBytes();
            fos.write(isi);
            
            
            
            
            
            
            
            
            
            
            
            
            
            fos.close();
            }
            catch(Exception e){
                System.out.println("terjadi kesalahan saat menulis file");
            }
    }
    
}
