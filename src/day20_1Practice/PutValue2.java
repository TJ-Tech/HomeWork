package day20_1Practice;

import java.util.HashMap;
import java.util.Map;

public class PutValue2 {
    public static void main(String[] args) {
        String [] names= {"Max","Drake","Susan"};
        HashMap<String,Integer>myMap = new HashMap<>();

        for(int i=0; i<names.length;i++) {
            myMap.put(names[i], 0);
        }System.out.println(myMap);
        //write you code here

        //end of you code
//        System.out.println(map);
        //output:
        //{"Max"=0,"Drake"=0,"Susan"=0}
    }}
