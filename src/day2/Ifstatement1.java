package day2;

public class Ifstatement1 {
    public static void main(String[] args) {

        int a1 = 10;

        if (a1 >= 10) {
            System.out.println("Statement is true");
        }

            int grade = 60;
            if (grade < 50) {
                System.out.println("fail");
            }
            else if (grade >= 50 || grade <= 70) {
                System.out.println("Your grade is C");
            }
            else if (grade > 70 || grade <= 90) {
                System.out.println(" Your grade is B");
            }
            else if(grade > 90 || grade <= 100) {
                System.out.println(" Your grade is A");

            } else {
                System.out.println("Invalid Grade");}


//            int year = 2000;
//            if (year >= 2000)
//                System.out.println("It's 20 century");
//
//            if (year == 2000)
//                System.out.println("It's millennium");
//
//            if (year < 2000)
//                System.out.println("It's 19th century");
//
//
//            int temperature = 10;
//            if (temperature >= 70) {
//
//                System.out.println("Its hot");
//            }
//
//            if (temperature < 70 && temperature >= 60) {
//                System.out.println("Its warm");
//            }
//            if (temperature < 60 && temperature >= 20) {
//                System.out.println("Its warm");
//            }
//            if (temperature < 20) {
//                System.out.println("Its Freezing");
//            }


        }
    }
