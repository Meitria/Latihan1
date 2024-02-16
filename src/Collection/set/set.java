
package Collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
     public static void main(String[] args) {
        Set<String> nama = new HashSet<String>();

        // Masukkan value ke dalam setdah
        nama.add("Farhan");
        nama.add("Dhea");
        nama.add("Ipnu");
        nama.add("Ihcsan");
        nama.add("Kharis");
        nama.add("Calvin");

        // Tampilkan value nama
        System.out.println(nama);
        for (Iterator<String> iterator = nama.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);
        }
    }
    
}
