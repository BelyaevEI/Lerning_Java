package com.company;
import java.util.Scanner;

// Вывести квадрат числа от 10 до 20 включительно

public class Cycle {
    public static void main(String[] args) {
        for( int i = 10; i < 21; i++){
            System.out.printf("Квадрат числа %d равен %.0f \n", i, Math.pow(i, 2) );
//            System.out.println(Math.pow(i, 2));
        }
    }
}
