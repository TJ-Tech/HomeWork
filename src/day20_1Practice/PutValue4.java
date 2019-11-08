package day20_1Practice;

import java.util.HashMap;

public class PutValue4 {
    public static void main(String[] args) {
        String sentence = "hello";

        HashMap<Character, Integer> letterMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {
            letterMap.put(letter, 0);
        }
        System.out.println(letterMap);
    }
}
