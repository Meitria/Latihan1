/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
/**
 *
 * @author Dell
 */
public class sortedmap {
public static void main(String[] args) {
    
    SortedMap<Integer,String> sm = new ConcurrentSkipListMap<Integer,String>();
    sm.put(1, "Apple");
    sm.put(2, "Blueberry");
    sm.put(3, "Kiwi");
    
    TreeMap<Integer,String> tm = new TreeMap<Integer,String>(sm);
    System.out.println(tm);
  }
}
    

