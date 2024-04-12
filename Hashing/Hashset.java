package Hashing;
import java.util.*;

public class Hashset {

    public static void main (String args[]){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(7);
        //iteration on hashset
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //advance for loop
        for (Integer num : hs) {
            System.out.println(num);
            
        }

        // System.out.println(hs);

    }
    
}
