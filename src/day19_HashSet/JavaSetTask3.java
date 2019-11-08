package day19_HashSet;

import java.util.HashSet;

public class JavaSetTask3 {
    public static void main(String[] args) {
        HashSet<Integer> setNumbers = new HashSet<>();
        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(3);
        setNumbers.add(10);
//        setNumbers.clear();
        setNumbers.remove(1);
        setNumbers.remove(2);

      System.out.println(setNumbers);
        }}
//
