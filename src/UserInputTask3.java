import java.util.Scanner;

public class UserInputTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Provide a number:");

        int number = scan.nextInt();
        System.out.println("Your number is:" + number);

        if(number < 0) {
            System.out.println("Negative");
        }
         if(number > 0 ){
             System.out.println("Pozitif");}

             if(number == 0 ){
                 System.out.println("It's ZERO");
        }
    }
}
