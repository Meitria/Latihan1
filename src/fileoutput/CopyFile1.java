package fileoutput;
import java.io.*;
public class CopyFile1 {
    public static void main(String args[]) throws IOException
   {
      FileInputStream in = null;
      FileOutputStream out = null;
      try {
         in = new FileInputStream("D:\\Data pribadi.txt");
         out = new FileOutputStream("D:\\output1.txt");
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
    

