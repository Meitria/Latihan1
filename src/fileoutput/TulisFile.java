/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoutput;
import java.io.FileOutputStream;

import java.io.IOException;
/**
 *
 * @author user
 */
public class TulisFile {
    
    public static void main(String args[]){

        FileOutputStream foutput=null;

        String data="Halo And Hai";


        //membuka file

        try{

            foutput = new FileOutputStream("d:/Output.txt");

        }catch(IOException e){}


        //menulis data kedalam file

        try{

            for(int i=0;i<data.length();i++){

                foutput.write((int) data.charAt(i));

            }

        }catch(IOException e){}


        try{

            foutput.close();

        }catch(IOException e){}


    }


}

    
