package Hashing;

import java.util.*;

public class linkHashSet {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(7);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(6);
        lhs.add(7);
        lhs.add(6);
        System.out.println(lhs);







    }
    
}
