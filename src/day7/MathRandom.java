package day7;

public class MathRandom {
    public static void main(String[] args) {
        //Random numbers in java use Math.random()

        int min = 1;
        int max = 20;
        double random = Math.random();

        int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(random);

        int max2 = 100;
        double r2 = random * max2; // 0 - 10
        int i1 = (int)r2;
        System.out.println(r2);
        System.out.println(i1);

        //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));


//        String v6 = "160.95";
//        double price = Double.valueOf(v6);
//        //range 1 - 10
//        double quantity = randomInRange;
//
//        boolean checkingPrice = price * quantity == 321.




    }
}
