package day4;

public class SampleClass {
    public static void main(String[] args) {
        String first = "Hi";
        String second = "Bye";
        makeAbba(first,second);}
        static void makeAbba(String first, String second){
            System.out.println("hiByeByeHi");
            System.out.println(first + second + second + first);
        }
}
