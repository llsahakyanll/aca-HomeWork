package com.aca;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day12 {
    public static void funcMain() {
//    ---------------|~\~\ DAY 12 Home Work /~/~|---------------

//    ---------------| Task 1 |---------------
        /*add(10);
        add(5,2);
        add(20,50,10);*/
//    ---------------| End Task 1 |-----------

//    ---------------| Task 2 |---------------
        /*System.out.println(add(10, 50));
        System.out.println(add(50, 5f));*/
//    ---------------| End Task 2 |-----------

//    ---------------| Task 3 |---------------
//        I have fixed!
//    ---------------| End Task 3 |-----------

//    ---------------| Task 4 |---------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Number of Float Type Array : ");
        int x = scanner.nextInt();
        float[] arrFloat = new float[x];
        System.out.println(Arrays.toString(func(arrFloat)));

        System.out.print("Please Enter Number of Int Type Array : ");
        int y = scanner.nextInt();
        int[] arrInt = new int[y];
        System.out.println(Arrays.toString(func(arrInt)));

        System.out.print("Please Enter Number of Double Type Array : ");
        int z = scanner.nextInt();
        double[] arrDouble = new double[z];
        System.out.println(Arrays.toString(func(arrDouble)));*/
//    ---------------| End Task 4 |-----------

//    ---------------| End Task 5 |-----------
        /*int[] arr = {1,20,50,809,9,45,7070,20};
        System.out.println(search(arr));

        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new Random().nextInt(arr2.length + 1);
        }
        System.out.println(search(arr2, 10));

        int[] arr3 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = new Random().nextInt(arr3.length + 1);
        }
        System.out.println(search(arr3, 10, 5));*/
//    ---------------| End Task 5 |-----------

//    ---------------| Task 6 |---------------
        /*System.out.println(square(10));
        System.out.println(square(10f));
        System.out.println(square(10, 5));*/
//    ---------------| End Task 6 |-----------

//    ---------------| Task 7 |---------------
        /*System.out.println(max(10, 20));
        System.out.println(max(10, 20, 30));
        System.out.println(max(10, 20,30,40));*/
//    ---------------| End Task 7 |-----------

//    ---------------| Task 8 |---------------

//    ---------------| End Task 8 |-----------

    }   //-----------| Functions ! |----------

//    ---------------| FUNCTION Task 1 |-------------
        /*public static void add(int x) {
        System.out.println(x);
    }
    public static void add(double x, int z) {
        System.out.println(Math.pow(x, z));
    }
    public static void add(int z, int x, int y) {
        System.out.println((z + x)/y);
    }*/
//    ---------------| End FUNCTION Task 1 |---------

//    ---------------| FUNCTION Task 2 |-------------
        /*public static float add(int x, float z) {
            float result = x / z;
            return result;
        }
        public static int add(int x, int z) {
            int result = x + z;
            return result;
        }*/
//    ---------------| End FUNCTION Task 2 |---------

//    ---------------| FUNCTION Task 3 |-------------

//    ---------------| End FUNCTION Task 3 |---------

//    ---------------| FUNCTION Task 4 |-------------
        /*public static float[] func(float[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextFloat() * 100;
            }
            return arr;
        }
        public static int[] func(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextInt(11);
            }
            return arr;
        }
        public static double[] func(double[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextDouble() * 100;
            }
            return arr;
        }*/
//    ---------------| End FUNCTION Task 4 |---------

//    ---------------| FUNCTION Task 5 |-------------
        /*public static int search(int[] arr) {
            return arr.length;
        }

        public static int search(int[] arr, int x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x ) {
                    return i;
                }
            }
            return arr.length;
        }

        public static boolean search(int[] array, int x, int i) {
            boolean t = false;
            if (array[i] == x) {
                t = true;
            }
            return t;
        }*/
//    ---------------| End FUNCTION Task 5 |---------

//    ---------------| FUNCTION Task 6 |-------------
        /*public static double square(int x) {
            return 3.14 * x * x;
        }
        public static float square(float x) {
            return x * x;
        }
        public static int square(int x, int y) {
            return x * y;
        }*/
//    ---------------| End FUNCTION Task 6 |---------

//    ---------------| FUNCTION Task 7 |-------------
        /*public static int max(int a, int b) {
            return Math.max(a,b);
        }
        public static int max(int a, int b, int c) {
            int[] arr = {a,b,c};
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
        public static int max(int a , int b, int c, int d) {
            int[] arr = {a,b,c,d};
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }*/
//    ---------------| End FUNCTION Task 7 |---------

//    ---------------| FUNCTION Task 8 |-------------

//    ---------------| End FUNCTION Task 9 |---------

//    ---------------| FUNCTION Task 9 |-------------

//    ---------------| End FUNCTION Task 8 |---------

//    ---------------|~\~\ End DAY 12 Home Work /~/~|------------

}
