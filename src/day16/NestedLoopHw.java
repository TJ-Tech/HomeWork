package day16;

import org.w3c.dom.ls.LSOutput;
public class NestedLoopHw {
public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};

        int evenCounter = 0;
        for (int i = 0; i < intArray.length; i++) {
        int currentNumber = intArray[i];
        boolean numberIsEven = currentNumber % 2 == 0;

        if (numberIsEven) {
        evenCounter++;
        }
        }

        System.out.println("you have " + evenCounter + " even numbers");
        }

        }