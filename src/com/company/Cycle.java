package com.company;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Cycle {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        strings = new String[6];

        for(int i = 0; i < 6; i++){
            strings[i] = scan.nextLine();
        }

        for(int i = 0; i < strings.length; i++){
            String currentString = strings[i];
            for(int k = i + 1; k < strings.length; k++){

                if (currentString == null) {
                    break;
                }

                if (currentString.equals(strings[k])) {
                    strings[k] = null;
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
