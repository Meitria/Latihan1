
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.map;
import java.util.*;
/**
 *
 * @author ASUS E203N
 */
public class HasMap {
    public static void main (String []args){
        
       // Ketik OBject Hasmap
       HashMap hMap =new HashMap();
       hMap.put("1", "One");
       hMap.put("2", "Two");
       hMap.put("3", "Three");
       
       boolean blnExists=hMap.containsValue("Two");
       System.out.println("Two exists in HashMap ? : "+ blnExists);
    }
    
}
