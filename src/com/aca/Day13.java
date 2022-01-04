package com.aca;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Day13 {
    public static void funcMain() {
//    ---------------|~\~\ DAY 13 Home Work /~/~|---------------

//    ---------------| Task 1 |---------------
        /*System.out.println(retStrSize("hello"));*/
//    ---------------| End Task 1 |-----------

//    ---------------| Task 2 |---------------
        /*System.out.println(retChar("Hello", 4));*/
//    ---------------| End Task 2 |-----------

//    ---------------| Task 3 |---------------
        /*System.out.println(charContCheck("Hello", 'l'));*/
//    ---------------| End Task 3 |-----------

//    ---------------| Task 4 |---------------
        /*System.out.println(vowelSum("Hello"));*/
//    ---------------| End Task 4 |-----------

//    ---------------| Task 5 |---------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        System.out.println("The reverse of the String \""+ str + "\" is \"" + reverseString(str)+"\"");*/
//    ---------------| End Task 5 |-----------

//    ---------------| Task 6 |---------------
        /*System.out.print("Enter a String: ");
        String str = new Scanner(System.in).next().toLowerCase(Locale.ROOT);
        countVowelsDigits(str);*/
//    ---------------| End Task 6 |----------

//    ---------------| Task 7 |---------------

//    ---------------| End Task 7 |----------

    }

//    ---------------| Task 1 |---------------
        /*public static int retStrSize(String x) {
            return x.length();
        }*/
//    ---------------| End Task 1 |-----------

//    ---------------| Task 2 |---------------
        /*public static char retChar(String x, int y) {
            return x.charAt(y);
        }*/
//    ---------------| End Task 2 |-----------

//    ---------------| Task 3 |---------------
        /*public static boolean charContCheck(String str, char ch) {
            boolean t = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    t = true;
                }
            }
            return t;
        }*/
//    ---------------| End Task 3 |-----------

//    ---------------| Task 4 |---------------
        /*public static int vowelSum(String str) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) == 'a') || (str.charAt(i) == 'A') || (str.charAt(i) == 'e') || (str.charAt(i) == 'E') || (str.charAt(i) == 'i') || (str.charAt(i) == 'I') || (str.charAt(i) == 'o') || (str.charAt(i) == 'O') || (str.charAt(i) == 'u') || (str.charAt(i) == 'U')) {
                    sum += str.charAt(i);
                }
            }
            return sum;
        }*/
//    ---------------| End Task 4 |-----------

//    ---------------| Task 5 |---------------
        /*public static String reverseString(String str) {
            StringBuilder sttt = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                sttt.append(str.charAt(i));
            }
            return sttt.toString();
        }*/
//    ---------------| End Task 5 |----------

//    ---------------| Task 6 |---------------
        /*public static void countVowelsDigits(String str) {
            int vowelNum = 0;
            int digitNum = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch)) {
                    digitNum++;
                }else {
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                        vowelNum++;
                    }
                }
            }
            double x = (vowelNum * str.length())/100.0;
            double y = (digitNum * str.length())/100.0;
            System.out.println("Number of vowels: "+vowelNum+ " "+x);
            System.out.println("Number of digits: "+digitNum+ " "+y);
        }*/
//    ---------------| End Task 6 |----------

//    ---------------| Task 7 |---------------

//    ---------------| End Task 7 |----------
}


