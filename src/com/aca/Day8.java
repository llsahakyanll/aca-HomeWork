package com.aca;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day8 {
     static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println(Arrays.toString(b));
    }
    public static void funcMain() {
//    ---------------|~\~\ DAY 8 Home Work /~/~|---------------

//    ---------------| Task 1 |---------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Size of Array : ");
        int x = scanner.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(x);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i+=2) {
            System.out.println(arr[i]);
        }*/
//    ---------------| End Task 1 |-----------

//    ---------------| Task 2 |---------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Size of Array : ");
        int x = scanner.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(x);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }*/
//    ---------------| End Task 2 |-----------

//    ---------------| Task 3 |---------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Size of Array : ");
        int x = scanner.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(x);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }*/
//    ---------------| End Task 3 |-----------

//    ---------------| Task 4 |---------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Size of Array : ");
        int x = scanner.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(x);
        }
        int maxArrNum = arr[0];
        int mm = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (maxArrNum < arr[i]) {
                maxArrNum = arr[i];
            }
            if (maxArrNum - 1 == arr[i]){
                mm = arr[i];
            }
        }
        System.out.println(mm);
        System.out.println(maxArrNum);*/
//    ---------------| End Task 4 |-----------

//    ---------------| Task 5 |---------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Size of Array : ");
        int x = scanner.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(x);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                System.out.println(arr[i-1] +" "+arr[i]);
                break;
            }
        }*/
//    ---------------| End Task 5 |-----------

//    ---------------| Task 6 |---------------
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Size of Array : ");
        int x = scanner.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(x);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                System.out.println("index is : "+i);
            }
        }
        System.out.println("The largest is : "+max);*/
//    ---------------| End Task 6 |-----------

//    ---------------| Task 7 |---------------
        /*int max = 1000;
        int min = -1000;
        int range = max - min + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array Length : ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * range) + min;
        }



        int minNumber = 1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
                if (array[i] < minNumber) {
                    minNumber = array[i];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(minNumber);*/
//    ---------------| End Task 7 |-----------

//    ---------------| Task 8 |---------------
        /*int max = 1000;
        int min = -1000;
        int range = max - min + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array Length : ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * range) + min;
        }

        int minNumber = 1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
                if (array[i] < minNumber) {
                    minNumber = array[i];
                }//else {
                    //minNumber = Integer.parseInt("10");
                //}
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(minNumber);*/
//    ---------------| End Task 8 |-----------

//    ---------------| Task 9 |---------------
        /*Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(x);
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr, arr.length);*/
//    ---------------| End Task 9 |-----------

//    ---------------| Task 10 |---------------
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(x);
            for (int j = arr.length - 1; j >= 0; j--) {
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
//    ---------------| End Task 10 |-----------

//    ---------------|~\~\ DAY 8 Home Work /~/~|---------------
    }

}
