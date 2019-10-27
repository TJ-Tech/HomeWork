package day4;

public class HomeWork {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 5;
        int num3 = 3;
        callAdd(num1, num2, num3);
        callMultiply(num1, num2, num3);
        callDeduct(num1, num2, num3);
        callDivide(num1, num2, num3);
    }

    static void callAdd(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    static void callMultiply(int num1, int num2, int num3) {
        System.out.println(num1 * num2 * num3);
    }

    static void callDeduct(int num1, int num2, int num3) {
        System.out.println(num1 - num2 - num3);
    }

    static void callDivide(int num1, int num2, int num3) {
        System.out.println(num1 / num2 / num3);


    }
}
