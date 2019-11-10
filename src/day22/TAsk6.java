package day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TAsk6 {
    public static void main(String[] args) {
//        Write a Java program to sort in reverse order a numeric array
        int[] numbers = {3, 5, 10, 1};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        for(int i = numbers.length-1; i>=0; i--){
            System.out.print(numbers[i]+" ");
        }

        //part2, copy reverse ordered array to new array;
        int[] reversedNumbers = new int[numbers.length];
        System.out.println(Arrays.toString(reversedNumbers));
        //output should be [10, 5, 3, 1]
    }
}