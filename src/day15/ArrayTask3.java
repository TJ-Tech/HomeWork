package day15;

import day6.StringReplace;

import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");

            }
        System.out.println("\nPart2 ---------------");

        for (int i = arr.length - 1 ; i >= 0; i--) {
            System.out.print( "reverse " +  arr[i]);
        }
        }
    }



