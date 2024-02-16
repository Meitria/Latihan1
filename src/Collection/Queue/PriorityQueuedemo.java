/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.Queue;
import java.util.*;
/**
 *
 * @author ASUS E203N
 */
public class PriorityQueuedemo {PriorityQueue<String> stringQueue;
public static void main (String []args){
    PriorityQueue<String> stringQueue = new PriorityQueue<String>();
    stringQueue.add("ab");
    stringQueue.add("abcd");
    stringQueue.add("abc");
    stringQueue.add("a");
    while (stringQueue.size()> 0)
        System.out.println(stringQueue.remove());
            
}
    
}
