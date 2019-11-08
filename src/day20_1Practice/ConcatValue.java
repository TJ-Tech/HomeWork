package day20_1Practice;

import java.util.HashMap;

public class ConcatValue {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "b");
        for (int i = 0; i < 3; i++) {
            //write you code here
            map.put("A", "b");
            System.out.println(map);
            String value = map.get("A");



            //end of you code
            System.out.println(map);
        }
    }
}
