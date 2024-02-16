package fileoutput;


import java.util.Formatter;
public class createfile {
    public static void main(String args[]){
        try {
            Formatter frm = new Formatter("D:\\PBO.txt");
            frm.format ("Belajar Java");
            frm.close();
            System.out.println("File telah dibuat");
        }
        catch(Exception e){
            System.out.println("Error");
            
        }
    }
    
}
