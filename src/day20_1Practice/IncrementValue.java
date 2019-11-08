package day20_1Practice;

import java.util.HashMap;

public class IncrementValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        String sentence = "ABC";

        for (int i = 0; i < 3; i++) {
            //write you code here
            map.put("A", i);

            //end of you code
            System.out.println(map);
        }
    }
}
