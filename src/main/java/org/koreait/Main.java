package org.koreait;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

       for (int i = 0; i < n; i++) {
           for (int j = 0; j <= n; j++) {
               System.out.print(" ");
           }
           for (int j = n; j > i; j--) {
               System.out.print(i%n);
           }
           System.out.println();
       }
    }
}