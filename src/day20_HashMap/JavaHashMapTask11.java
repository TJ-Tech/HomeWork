package day20_HashMap;

import java.util.HashMap;
import java.util.Set;

public class JavaHashMapTask11 {
    public static void main(String[] args) {

        HashMap<Character,Boolean> map= new HashMap<>();

        map.put('A', true);
        map.put('B',true);
        map.put('C',false);

        // get keyset value from map
        Set keyset = map.keySet();

        // check key set values
        System.out.println("Key set values are: " + keyset);
    }
}
