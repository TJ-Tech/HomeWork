package day11;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String str = s.nextLine();
        if (str.equals("Quit")) {
            System.out.println("String is too large");
        }
        if (str.contains("A") || str.contains("B")) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak password");
        }

        String line = "";
        String lineUppercase = line.toUpperCase();
        if (line.equals(lineUppercase)) {
            System.out.println("Use Lowercase Letters");
        }
    }
}
