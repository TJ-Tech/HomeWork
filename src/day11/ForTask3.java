package day11;

import java.util.Scanner;

public class ForTask3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Provide a max number");
        int max = s.nextInt();
        int sum = 0;
        int avarage = 0;

        for(int i = 1; i <= max; i++){

            System.out.println(i);
            sum += i; // same as sum = sum + i;
            avarage++;

        }

        System.out.println("sum is " + sum);
        System.out.println("Avarage is " + ((double) sum / max));


    }
    }

