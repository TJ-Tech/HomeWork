package day14;

public class homeWorkAvarage {
    public static void main(String[] args) {
        //Task 1. write a for loop that finds an maximum for the array
        //Task 2. write a for loop that finds an minimum for the array
        //Task 3. write a for loop that finds an average for the array
        // int[] myArray = {34,5,6,2,3,78,1}
        //OUTPUT: average: (34+5+6+2+3+78+1)/7
        int[] myArray = {34,5,6,2,3,78,1};
        int max = myArray[0];
        for (int i= 0; i< myArray.length; i++){
            if(myArray[i]> max){
                max =myArray[i]; }
        }
        System.out.println(max);
}}
