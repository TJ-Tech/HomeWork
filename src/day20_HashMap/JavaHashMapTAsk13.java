package day20_HashMap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTAsk13 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 150);
        map.put("Melon", 145);
        map.put("Berry", 250);

        int sum = 0;
        for(Map.Entry<String, Integer> e : map.entrySet()){
            int price = e.getValue();

            sum += price;// sum = sum + price;
        }


        System.out.println("Sum items: " + sum);
    }}