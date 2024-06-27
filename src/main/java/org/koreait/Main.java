package org.koreait;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fibonacci(10);
    }

    public static void fibonacci(int n) {
        int num1 = 1;
        int num2 = 0;
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            System.out.print(sum + " ");

            sum = num1 + num2;
            num1 = num2 ;
            num2 = sum;


        }
    }
}