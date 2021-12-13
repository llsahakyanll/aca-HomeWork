package com.aca;

import java.util.Scanner;

public class Person {
    public int age = 50;
    public static int[] readArray() {
        int[] arr;
        Scanner userArrNumber = new Scanner(System.in);
        System.out.print("Please Enter Number of Arrays: ");
        int n = userArrNumber.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Please Enter Content for a[" + i +"] : " );
            arr[i] = userArrNumber.nextInt();
        }
        return arr;
    };
    public static int func() {
        Scanner userNumber = new Scanner(System.in);
        int a = userNumber.nextInt();
        int b = userNumber.nextInt();
        return a + b;
    };
}
