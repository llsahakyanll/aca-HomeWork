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

//    ---------------| Task 7 |---------------
        /*System.out.println(removeX("xxadax"));*/
//    ---------------| End Task 7 |-----------

//    ---------------| Task 8 |---------------
        /*reverse("sahakyan sahak");*/
//    ---------------| End Task 8 |-----------

//    ---------------| Task 9 |---------------
        /*System.out.println(endX("xxhixx"));*/
//    ---------------| End Task 9 |-----------

//    ---------------| Task 10 |---------------
        /*System.out.println(stringClean("aaavddaawq"));*/
//    ---------------| End Task 10 |-----------

//    ---------------| Task 11 |---------------
        /*System.out.println(isPrime(57));*/
//    ---------------| End Task 11 |-----------

//    ---------------| Task 12 |---------------
        /*Digits(12984);*/
//    ---------------| End Task 12 |-----------

//    ---------------| Task 13 |---------------
        /*System.out.println(numDigits("dad55589"));*/
//    ---------------| End Task 13 |-----------

//    ---------------| Task 14 |---------------
        /*System.out.println(pairStar("aasafk52fd"));*/
//    ---------------| End Task 14 |-----------

//    ---------------| Task 15 |---------------
        /*String str = "sahakaa";
        System.out.println(addSimvol(str, (str.length() +1) / 2));*/
//    ---------------| End Task 15 |-----------

//    ---------------| Task 16 |---------------
        /*String x = "(abc (def (g";
        System.out.print(x + addMiroorLine(x));*/
//    ---------------| End Task 16 |-----------
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
            return removeX(str.substring(1));
        }*/
//    ---------------| End Task 7 |-----------

//    ---------------| Task 8 |---------------
        /*public static void reverse(String str) {
        if ((str==null)||(str.length() <= 1)) {
            System.out.println(str);
        }
        else {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }*/
//    ---------------| End Task 8 |-----------

//    ---------------| Task 9 |---------------
        /*public static String endX(String str) {
            if (str.equals("")) {
                return str;
            }
            if (str.charAt(0) == 'x') {
                return endX(str.substring(1)) + 'x';
            } else {
                return str.charAt(0) + endX(str.substring(1));
            }
        }*/
//    ---------------| End Task 9 |-----------

//    ---------------| Task 10 |---------------
        /*public static String stringClean(String str) {
            if (str.length() < 2) {
                return str;
            }
            if (str.charAt(0) == str.charAt(1)) {
                return stringClean(str.substring(1));

            } else {
                return str.charAt(0) + stringClean(str.substring(1));
            }
        }*/
//    ---------------| End Task 10 |-----------

//    ---------------| Task 11 |---------------
        /*public static boolean isPrime(int n) {
            boolean t = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    t = false;
                }
            }
            return t;
        }*/
//    ---------------| End Task 11 |-----------

//    ---------------| Task 12 |---------------
        /*public static void Digits(int n) {
            int largest = 0;
            while (n != 0) {
                int r = n % 10;
                largest = Math.max(r, largest);
                n = n / 10;
            }
            System.out.println(largest);
        }*/
//    ---------------| End Task 12 |-----------

//    ---------------| Task 13 |---------------
        /*public static int numDigits(String str) {
            if (str.length() <= 0) {
                return 0;
            }
            int count = 0;
            if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                count++;
            }
            return count + numDigits(str.substring(1));
        }*/
//    ---------------| End Task 13 |-----------

//    ---------------| Task 14 |---------------
        /*public static String pairStar(String str) {
            if (str.length() <= 1) {
                return str;
            }
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }*/
//    ---------------| End Task 14 |-----------

//    ---------------| Task 15 |---------------
        /*public static String addSimvol(String str, double middle) {
//            if (middle % 2 == 0) {
//
//            }
            if (str.length() <= 1) {
                return str;
            }else if(str.length() <= middle) {
                return str.charAt(0) + ")" + addSimvol(str.substring(1), middle);
            }
            return str.charAt(0) + "(" + addSimvol(str.substring(1), middle);
        }*/
//    ---------------| End Task 15 |-----------

//    ---------------| Task 16 |---------------
        /*public static String addMiroorLine(String str) {
            if (str.length() <= 1) {
                return str;
            }
            char x = ')';
            if(str.charAt(0) == '(') {
                *//*str.charAt(0) = x;*//*
            }
            return addMiroorLine(str.substring(1)) + str.charAt(0);
        }*/
//    ---------------| End Task 16 |-----------
}
