package fileoutput;
import java.io.File;
import java.util.Scanner;
class ReadFile{
   public static void main(String[]args){
        try{
            File file= new File("D:/java.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                System.out.print(sc.next());
        }
        sc.close();
        }catch (Exception e){
    System.out.println("Error");
}
    }
    
}
