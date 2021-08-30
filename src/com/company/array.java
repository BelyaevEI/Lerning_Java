package com.company;
import java.util.Scanner;

public class array {
    public static void doing(){
        out_sum( readArray());
    }
    public static int[] readArray(){
        int[] array;
        int n;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void out_sum( int[] arr){
        int summ = 0;
        int n;

        n = arr.length;
        for (int i = 0; i < n; i++){
            summ = summ + arr[i];
        }
        System.out.print(summ);
    }

}
