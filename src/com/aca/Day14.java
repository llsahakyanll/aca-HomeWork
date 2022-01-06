package com.aca;

import java.util.Arrays;
import java.util.Random;

public class Day14 {
    public static void funcMain() {

//    ---------------| Task 1 |---------------
        /*int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(11);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(findSum(arr, arr.length));*/

        /*System.out.println(factorial(5));*/
//    ---------------| End Task 1 |-----------

//    ---------------| Task 2 |---------------
        /*System.out.println(fibonachi(9));*/
//    ---------------| End Task 2 |-----------

//    ---------------| Task 3 |---------------
        /*System.out.println(triangle(4));*/
//    ---------------| End Task 3 |-----------

//    ---------------| Task 4 |---------------
        /*System.out.println(digitSum(145));*/
//    ---------------| End Task 4 |-----------

//    ---------------| Task 5 |---------------
        /*System.out.println(count7(717));*/
//    ---------------| End Task 5 |-----------

//    ---------------| Task 6 |---------------
        /*System.out.println(countX("xxadax"));*/
//    ---------------| End Task 6 |-----------
    }

//    ---------------| Task 1 |---------------
        /*public static int findSum(int[] arr, int i) {
            if (i <= 0) {
                return 0;
            }
            return findSum(arr,i - 1) + arr[i - 1];
        }*/

        /*public static int factorial(int i) {
            if (i <= 0) {
                return 1;
            }
            return i * factorial(i - 1);
        }*/
//    ---------------| End Task 1 |-----------

//    ---------------| Task 2 |---------------
        /*public static int fibonachi(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonachi(n - 1) + fibonachi(n - 2);
        }*/
//    ---------------| End Task 2 |-----------

//    ---------------| Task 3 |---------------
        /*public static int triangle(int rows) {
            if(rows < 2)
                return rows;
            return rows + triangle(rows-1);
        }*/
//    ---------------| End Task 3 |-----------

//    ---------------| Task 4 |---------------
        /*public static int digitSum(int n) {
            if (n < 10) {
                return n;
            }
            return (n % 10) + digitSum(n / 10);
        }*/
//    ---------------| End Task 4 |-----------

//    ---------------| Task 5 |---------------
        /*public static int count7(int n) {
            int counter = 0;
            if( n % 10 == 7) {
                counter++;
            }
            if( n / 10  == 0) {
                return counter;
            }
            return counter + count7(n/10);

        }*/
//    ---------------| End Task 5 |-----------

//    ---------------| Task 6 |---------------
        /*public static int countX(String str) {
            if (str == null || str.isEmpty())
                return 0;
            return (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1));
        }*/
//    ---------------| End Task 6 |-----------

//    ---------------| Task 7 |---------------
        /*public static int removeX(String str) {
            if (str == null || str.isEmpty())
                return 0;
            return (str.charAt(0) == 'x' ? 1 : 0) + removeX(str.substring(1));
        }*/
    /*
    https://github.com/ozelentok/CodingBat-Solutions/blob/master/Java/Recursion-1.java*/
//    ---------------| End Task 7 |-----------
}
