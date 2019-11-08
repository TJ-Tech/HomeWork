package day20_HashMap;

import java.util.HashMap;

public class JavaHashMapTask10 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Lemon");
        map.put(3, "Peach");
        map.put(4, "Avocado");
        map.put(5, "Pineapple");


        String value=(String)map.get(4);
        System.out.println("Value for key 4 is: " + value);
    }

}
