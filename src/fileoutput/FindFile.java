package fileoutput;
import java.io.File;
public class FindFile {
    public static void main(String args[]){
        File file;
        file=new File("D:/haki.jpg");
        if(file.exists()){
            System.out.println(file.getName()+"  File Ada");
        }else{
    System.out.println("File tidak ada");
}
    }
    
}



