package day20_HashMap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask14 {
    public static void main(String[] args) {
        // Apple Lemon Peach Melon Berry
        // 100 200 150 145 250
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Apple", 100);
            map.put("Lemon", 200);
            map.put("Peach", 150);
            map.put("Melon", 145);
            map.put("Berry", 250);

            // Hint: use as many loop as you like
//        for(Map.Entry<String, Integer> e : map.entrySet()){
//            System.out.print(e.getKey() + " ");
//        }

            for (String key : map.keySet()) {
                System.out.print(key + " ");
            }
            System.out.println();
            for (Integer value : map.values()) {
                System.out.print(value + " ");
            }}}
