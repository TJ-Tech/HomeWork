package day15;

public class ArrayForLoops {
    public static void main(String[] args) {

        int[] arr1 = {2, 11, 45, 9};

        int[] arr2 = new int[4];
        arr2[0] = 2;
        arr2[1] = 11;
        arr2[2] = 45;
        arr2[3] = 9;


        for (int num : arr1) {
            System.out.println(num);
            //1. num = 2;
            //2. num = 11;
            //3. num = 45;
            //4. num = 9;
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1:" + arr1[i]);
            System.out.println("arr2:" + arr2[i]);
        }
    }

}
