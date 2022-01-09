package com.aca;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day6 {
    public static void funcMain() {
//    ----------------------------|~\~\ DAY 6 Home Work /~/~|--------------------------------------------------

//    ----------------------------| HomeWork Task 1 |----------------------------------------------------------
        /*for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }*/
//    ----------------------------| End HomeWork Task 1 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 2 |----------------------------------------------------------
        /*for (int i = 1; i <= 20 ; i++) {
            if ( i % 2 == 0){
                System.out.println(i);
            }
        }*/
//    ----------------------------| End HomeWork Task 2 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 3 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int z = 2;
        for (int i = 1; i <= a ; i++) {
            double x = Math.pow(i,z);
            if (x < a) {
                System.out.println(x);
            }
        }*/
//    ----------------------------| End HomeWork Task 3 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 4 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 2; i <= a; i++) {
            if( a % i == 0) {
                System.out.println(i);
                break;
            }
        }*/
//    ----------------------------| End HomeWork Task 4 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 5 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int temp = pow(2, i);
            if (temp > a) {
                break;
            };
            System.out.println(temp);

        };*/
//    ----------------------------| End HomeWork Task 5 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 6 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i >= 0 ; i--) {
            System.out.println(i);
        }*/
//    ----------------------------| End HomeWork Task 6 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 7 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i >= 0 ; i--) {
            double x = Math.sqrt(i);
            if (x % 2 == 0){
                System.out.println(x);
            }
        }*/
//    ----------------------------| End HomeWork Task 7 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 8 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i >= 0 ; i--) {
            double x = Math.sqrt(i);
            if ( x == 2) {
                System.out.println(i);
            }
        }*/
//    ----------------------------| End HomeWork Task 8 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 9 |------------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int temp = pow(2, i);
            if (temp >= a) {
                System.out.println(i);
                break;
            }
        }*/
//    ----------------------------| End HomeWork Task 9 |--------------------------------------------------------

//    ----------------------------| HomeWork Task 10 |------------------------------------------------------------
        /*int max = 32;
        int min = 122;
        int range = max - min + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array Length : ");
        char[] array = new char[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            int i1 = (int) (Math.random() * range) + min;
            array[i] = (char) i1;
        }
        System.out.println(Arrays.toString(array));*/
//    ----------------------------| End HomeWork Task 10 |--------------------------------------------------------

//    ----------------------------| HomeWork Task 11 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i <= a ; i++) {
            if ( i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }*/
//    ----------------------------| End HomeWork Task 11 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 12 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i <= a ; i++) {
            if ( i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }*/
//    ----------------------------| End HomeWork Task 12 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 13 |------------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double oneDay = (x * 10) / 100 + x;
        double y = scanner.nextDouble();
        int days = (int) (y / oneDay);
        System.out.println(days);*/
//    ----------------------------| End HomeWork Task 13 |--------------------------------------------------------

//    ----------------------------| HomeWork Task 14 |------------------------------------------------------------

//    ----------------------------| End HomeWork Task 14 |--------------------------------------------------------

//    ----------------------------| HomeWork Task 15 |------------------------------------------------------------
//        -----| Պահանջը ? |-----
//    ----------------------------| End HomeWork Task 15 |--------------------------------------------------------

//    ----------------------------| HomeWork Task 16 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Number From 0 to 10 : ");
        int a = scanner.nextInt();
        Random rand = new Random();
        int randInt = rand.nextInt(10);
        while (true) {
            if (randInt == a) {
                System.out.println("Yes, you guessed the number.");
                break;
            } else if (randInt < a) {
                System.out.println("Too high");
                System.out.println("Try Again");
                a = scanner.nextInt();
            } else {
                System.out.println("Too low");
                System.out.println("Try Again");
                a = scanner.nextInt();
            }
        }*/
//    ----------------------------| End HomeWork Task 16 |-------------------------------------------------------

//    ----------------------------| HomeWork Task 17 |----------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= a ; i++) {
            sum += i;
        }
        System.out.println(sum);*/
//    ----------------------------| End HomeWork Task 17 |-------------------------------------------------------

//    ----------------------------|~\~\ End DAY 6 Home Work /~/~|-----------------------------------------------
    }

    //    ----------------------------| Math.pow |--------------------------------------
    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * pow(a, b - 1);
    }
}
