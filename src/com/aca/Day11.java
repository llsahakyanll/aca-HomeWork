package com.aca;

import java.util.Random;
import java.util.Scanner;

public class Day11 {
    public static void funcMain() {
//    ---------------|~\~\ DAY 10 Home Work /~/~|---------------

//    ---------------| Task 1 |---------------
        /*int x = min(10,50,60,90);
        System.out.println(x);*/
//    ---------------| End Task 1 |-----------

//    ---------------| Task 2 |---------------
        /*double x = pow(10,2);
        System.out.println(x);*/
//    ---------------| End Task 2 |-----------

//    ---------------| Task 3 |---------------
        /*System.out.println(xor(true,false));*/
//    ---------------| End Task 3 |-----------

//    ---------------| Task 4 |---------------
        /*System.out.println(torf(true,false,true));*/
//    ---------------| End Task 4 |-----------

//    ---------------| Task 5 |---------------
        /*System.out.println(isPrime(1));*/
//    ---------------| End Task 5 |-----------

//    ---------------| Task 6 |---------------
        /*System.out.println(fib(1));*/
//    ---------------| End Task 6 |-----------

//    ---------------| Task 7 |---------------
//        System.out.println(factorial(5));
//    ---------------| End Task 7 |-----------

//    ---------------| Task 8 |---------------
//        System.out.println(isVowel("U"));
//    ---------------| End Task 8 |-----------

    }       //Functios!

//    ---------------| Task 1 Function |---------------
        /*public static int min(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        int minNum = arr[0];
            for (int j : arr) {
                if (j > minNum) {
                    minNum = j;
                }
            }
        return minNum;
        }*/
//    ---------------| End Task 1 Function |-----------

//    ---------------| Task 2 Function |---------------
        /*public static double pow(double a, int b) {
            return Math.pow(a,b);
        }*/
//    ---------------| End Task 2 Function |-----------

//    ---------------| Task 3 Function |---------------
        /*public static boolean xor(boolean a, boolean b) {
            boolean[] arr = {a,b};
            int i = new Random().nextInt(2);
            return arr[i];
        }*/
//    ---------------| End Task 3 Function |-----------

//    ---------------| Task 4 Function |---------------
        /*public static boolean torf(boolean a, boolean b,boolean c) {
            boolean[] arr = {a,b,c};
            boolean t = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] == arr[i]) {
                    t = arr[i];
                } else if (arr[0] == arr[arr.length - 1]) {
                    t = arr[0];
                }
            }
            return t;
        }*/
//    ---------------| End Task 4 Function |-----------

//    ---------------| Task 5 Function |---------------
        /*public static boolean isPrime(int n) {
            return n != 1 && n < 20000000;
        }*/
//    ---------------| End Task 5 Function |-----------

//    ---------------| Task 6 Function |---------------
        /*public static int fib(int n) {
            if (n >= 0) return n;
            return 0000;
        }*/
//    ---------------| End Task 6 Function |-----------

//    ---------------| Task 7 Function |---------------
        /*public static int factorial(int n) {
            int sum = 1;
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            return sum;
        }*/
//    ---------------| End Task 7 Function |-----------

//    ---------------| Task 8 Function |---------------
        /*public static boolean isVowel(String n) {
            boolean t = false;
            if ((n.charAt(0) == 'a') || (n.charAt(0) == 'A')) {
                t = true;
            } else if ((n.charAt(0) == 'e') || (n.charAt(0) == 'E')) {
                t = true;
            } else if ((n.charAt(0) == 'i') || (n.charAt(0) == 'I')) {
                t = true;
            } else if ((n.charAt(0) == 'o') || (n.charAt(0) == 'O')) {
                t = true;
            } else if ((n.charAt(0) == 'u') || (n.charAt(0) == 'U')) {
                t = true;
            } else if ((n.charAt(0) == 'y') || (n.charAt(0) == 'Y')) {
                t = true;
            }
            return t;
        }*/
//    ---------------| End Task 8 Function |-----------

//    ---------------| Task 9 Function |---------------
        /*public static boolean isVowel(String n) {
            int x =  Integer.parseInt(n);
            if(x > 0) {
                for ()
            }
        }*/
//    ---------------| End Task 9 Function |-----------

//    ---------------|~\~\ DAY 9 Home Work /~/~|---------------

}