/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasifileIO;

import java.io.File;

/**
 *
 * @author ASUS E203N
 */
public class direktori {
    public static void main(String []args){
        String dirname ="/SMK/pbo";
        File d = new File(dirname);
        // membuat direktori
        d.mkdirs();
    }
    
}
