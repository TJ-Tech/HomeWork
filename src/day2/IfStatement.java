package day2;

public class IfStatement {
    public static void main(String[] args) {
        boolean statement = false;
        if (statement) {
            System.out.println("Statement is true");
        }


        int year = 2000;
        if (year >= 2000)
            System.out.println("It's 20 century");

        if (year == 2000)
            System.out.println("It's millennium");

        if (year < 2000)
            System.out.println("It's 19th century");


        int temperature = 10;
        if (temperature >= 70) {

                System.out.println("Its hot");
            }

        if (temperature < 70 && temperature >= 60) {
            System.out.println("Its warm");
        }
        if (temperature < 60 && temperature >= 20) {
            System.out.println("Its warm");
        }
        if (temperature < 20) {
            System.out.println("Its Freezing");
        }







        }}




