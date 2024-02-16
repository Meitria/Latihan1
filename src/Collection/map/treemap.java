/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.map;
  import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author Dell
 */
public class treemap {
  

  public static void main(String[] args) {
    Map<String,String> m = new HashMap<String,String>();
    m.put("red", "Apple");
    m.put("blue", "blueberry");
    m.put("green", "kiwi");
    TreeMap<String,String> tm = new TreeMap<String,String>(m);
    System.out.println(tm);
  }
}

    

