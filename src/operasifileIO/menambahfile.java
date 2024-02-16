package operasifileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASUS E203N
 */
public class menambahfile {
    public static void menambahkantekskedalamfile(String D, String java, String teks){
        File file=new File ("D: /java.txt");
        FileWriter fileWritter;
        try{
            //jika file tidak ada, maka otomatis membuat file
            if (!file.exists()){
                }
            fileWritter= new FileWriter(file,true);
            BufferedWriter bufferWritter = new BufferedWriter (fileWritter);
            bufferWritter.write(teks);
            bufferWritter.close();
        }catch (IOException ex){
            System.out.println("Append Teks kedalam file gagal :"+ex.toString());
        }
    }
}

