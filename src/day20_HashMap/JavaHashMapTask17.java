package day20_HashMap;
import javax.swing.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaHashMapTask17 {
    //17. Given map, update the values
    // Apple 333
    // Lemon 444
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("Apple", 333);
        map1.put("Lemon", 444);
        System.out.println(map1);
    }
}