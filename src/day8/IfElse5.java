package day8;

import java.util.Scanner;

public class IfElse5 {
    // byte-127 <-> 128
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number please:");
        long number = scan.nextLong();
        if(number >= -128 && number <= 127){
            System.out.println("DATATYPE IS BYTE");}
        else if(number >= -32768 && number <= 327767 ){
            System.out.println("Data Type is Short");
        }
        else if(number >= -2147483648 && number <= 2147483647){
            System.out.println("DataType is int");
        }
        else if(number >= -9.223372036854775808 && number <= 9.223372036854775807){
            System.out.println("DataType is long");
        }


        }
    }