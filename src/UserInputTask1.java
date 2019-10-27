import java.util.Scanner;

public class UserInputTask1 {
    public static void main(String[] args) {


    Scanner scan = new Scanner((System.in));
        System.out.println("Enter your name:");
    String name = scan.nextLine();
        System.out.println("Welcome " + name + "!!!!!");

        System.out.println("----------------");
    String s1 = scan.nextLine();
        System.out.println("Your text is: " + s1);

        System.out.println("----------------");
    String m1 = scan.nextLine();
        System.out.println("Your text is: " + m1);
    int n1 = scan.nextInt();
        System.out.println("Number is: " + n1);

}
}