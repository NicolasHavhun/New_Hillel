package com.hillel.havhun.homework5;


import java.util.Scanner;

public class Practice07_07 {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("input the number: ");

        int number1= scanner.nextInt();
        for (int i=0; i<=10; i++){

        System.out.println(number1 +"x" + (i)+"="+(number1*i));
        }

    }
}
