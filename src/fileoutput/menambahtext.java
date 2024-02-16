package fileoutput;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
public class menambahtext {
 public static void main(String[] args){
  try{
   String alamat = " P2 PURWODADI ";
   File file = new File("E:\\Data pribadi.txt");
   if(!file.exists()){
    file.createNewFile();
   }
   FileWriter fw = new FileWriter(file, true);
   BufferedWriter bw = new BufferedWriter(fw);
    byte[] isi = alamat.getBytes(); 
   bw.write(alamat);
   bw.close();
   System.out.println("file has been successfully write");
  }catch(IOException ex){
   ex.printStackTrace();
        }
 }
}

