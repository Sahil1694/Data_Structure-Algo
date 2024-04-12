package Hashing;
import java.util.*;

public class Hashmap {

    public static void main(String[]args){
    //create
    HashMap<String,Integer> hm = new HashMap<>();


    //Insert
    hm.put("India" , 100);
    hm.put("China" , 200);
    hm.put("Usa" , 300);

    // System.out.println(hm);

    //get
    // int pop = hm.get("India");
    // System.out.println(pop);

    //contains 
    // System.out.println(hm.containsKey("India"));

    //remove
    // System.out.println(hm.remove("India"));
    // System.out.println(hm);

    //size
    // System.out.println(hm.size());

    //iterate
    Set<String> keys = hm.keySet();
    System.out.println(keys);

    for (String k : keys) {
        System.out.println("key = "+k+ ",value = " + hm.get(k));
    }

    }
}
