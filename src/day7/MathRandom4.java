package day7;

public class MathRandom4 {
    public static void main(String[] args) {
        int min = -200;
        int max = 200;
        int range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange);

        if(randomInRange  < 0 )
        {
            System.out.println("Negatif");}
        if(randomInRange> 0 ){
            System.out.println("Pozitif");}
        if(randomInRange == 0 )
        {
            System.out.println("Zero");}

    }
}
