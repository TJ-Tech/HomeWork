package day13;

public class RemovaVowels {
    public static void main(String[] args) {


        //Write a method that would replace every vowel in the string with X.
        // hint you have to use .char
        String input = "Technostudy";
        char x = input.charAt(4);
        input = input.replaceAll("[e,o,u]", "X");
        System.out.println(input);
    }









}
