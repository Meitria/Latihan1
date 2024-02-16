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
public class HapusFile {
 public static void main(String[] args){
  File file = new File("D:/java.txt");
  file.delete();
 }
}  