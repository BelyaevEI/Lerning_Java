package com.company;

public class Table_multiplicate {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {

        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
            MULTIPLICATION_TABLE[i-1][k-1] = i * k;
            System.out.print(MULTIPLICATION_TABLE[i-1][k-1]);
            System.out.print(" ");

            }
        System.out.println();

        }
    }
}