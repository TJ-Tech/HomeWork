package day6;

import javax.print.DocFlavor;

public class StringLength {
    public static void main(String[] args) {

        String s1= "ABCDE";
        System.out.println(s1.length());
        int Length = s1.length();
        System.out.println(Length);
        String  username = "techno.study";

        if(username.length() < 10){
            System.out.println("you can login");
        }
        if(username.length() >= 10) {
            System.out.println("you can login");
        }
        String  a1= "ABC";
        String  a2=  "Z";
        System.out.println("Length is " + (a1+a2).length());
        System.out.println("Length is " + (a1.length() +a2.length()));

        int sum = a1.length() +a2.length();
        System.out.println("Length is: "+sum);
        String b2= "LongStingHere";
        String b1= "ShortOne";
        int subrtraction = b1.length() - b2.length();
        if(subrtraction <0){
            System.out.println(" You Can not Proceed");
        } else {// subtraction >= 0
            System.out.println("We can do it");
        }




    }
}
