package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число :");
        int num = input.nextInt();

        switch (num) {
            case 3:
                System.out.print("Число равно трем");
                break;
            case 5:
                System.out.print("Число равно пяти");
                break;
            default:
                System.out.print("Что-то другое");
        }
    }
}
