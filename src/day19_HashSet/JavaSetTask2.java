package day19_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class JavaSetTask2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);

        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);

        System.out.println("1.Way ---------------------");

        for (Integer setNumber : numbers) {
            System.out.println(setNumber);
            System.out.println("2.Way ---------------------");
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                Integer number = iterator.next();
                System.out.println(number);


            }

        }}}



