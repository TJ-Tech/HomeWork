package day22;

public class Task4 {
    public static void main(String[] args) {
//        write a java program to test if an array contains a specific value
        int[] num = {1, 23, 34, 45,34,53,6, 5};
        int toHave = 4;
        boolean found = false;
        for (int n : num) {
            if (n == toHave) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println(toHave + " is found.");
        else
            System.out.println(toHave + " is not found.");
    }

    }

