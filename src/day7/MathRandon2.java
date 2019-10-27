package day7;

public class MathRandon2 {
    public static void main(String[] args) {
        //task2 : print 2 random numbers 0 and 10;
        //ex: 4
        /// 5

        int max = 10;
        double random = Math.random();

        int randomInRange = (int) (Math.random() * (max));
        System.out.println(randomInRange);
        System.out.println(randomInRange);


        System.out.println("==========");

        int max2 = 10;
        double r2 = (int) Math.random() * max2; // 0 - 10
        int i1 = (int)r2;
        System.out.println(r2);
        System.out.println(i1);

        //int max2 = 100;
        //double r2 = random * max2; // 0 - 10
//        int i1 = (int)r2;
//        System.out.println(r2);
//        System.out.println(i1);

    }
}
