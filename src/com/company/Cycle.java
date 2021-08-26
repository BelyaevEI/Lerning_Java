package com.company;
import java.util.Scanner;

// Вывести квадрат числа от 10 до 20 включительно

public class Cycle {
    public static void main(String[] args) {
        for( int i = 10; i < 21; i++){
            System.out.println("Квадрат числа " + i + ":");
            System.out.println(Math.pow(i, 2));
        }
    }
}
