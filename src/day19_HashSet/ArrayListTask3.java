package day19_HashSet;

import java.util.ArrayList;

public class ArrayListTask3 {
    public static void main(String[] args) {
        //3. Write a Java program to insert an element into
        // the array list at the first position.
        // ex:
        // [red, white] added yellow
        // print => [yellow, red, white]
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        System.out.println(colors);

        colors.add(0, "Yellow");
        System.out.println(colors);



    }
}
