package com.aca;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Day6.funcMain();
        Day7.funcMain();
        Day8.funcMain();
        Day9.funcMain();
        Day11.funcMain();
        Day12.funcMain();

/*//      ----------------------------| For Me |--------------------------
        Person Sahak = new Person();
//        System.out.println(Sahak.age);
//        int temp = Sahak.func();
//        System.out.println(temp);
        int[] arrCatching = Person.readArray();
        System.out.println(Arrays.toString(arrCatching));
//      ----------------------------| End For Me |--------------------------*/

//    ----------------------------|~\~\ DAY 4 Home Work /~/~|--------------------------------------------------

//    ----------------------------| HomeWork Task 1 |----------------------------------------------------------
        /*Scanner userNumberScanner = new Scanner(System.in);
        System.out.print("Please Enter Your Age: ");
        int userNumber = userNumberScanner.nextInt();
        if (userNumber <= 0) {
            System.out.println("Error!!!");
        } else if (userNumber < 18) {
            System.out.println("You can't vote");
        } else {
            System.out.println("You can vote");
        }*/
//    ----------------------------| End HomeWork Task 1 |------------------------------------------------------

//    ----------------------------| HomeWork Task 2 |----------------------------------------------------------
        /*Scanner userNumberScanner2 = new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        int userNumber2 = userNumberScanner2.nextInt();
        if (userNumber2 % 2 == 0) {
            System.out.println(userNumber2 + " is even number.");
        } else {
            System.out.println(userNumber2 + " isn't even number.");
        }*/
//    ----------------------------| End HomeWork Task 2 |------------------------------------------------------

//    ----------------------------| HomeWork Task 3 |----------------------------------------------------------
        /*int a = 0;
        int b = 11;

        int random_number1 = a + (int) (Math.random() * b);
        System.out.println("1-st random number is: " + random_number1);

        int random_number2 = a + (int) (Math.random() * b);
        System.out.println("2-nd random number is: " + random_number2);

        int random_number3 = a + (int) (Math.random() * b);
        System.out.println("3-rd random number is: " + random_number3);*/
//    ----------------------------| End HomeWork Task 3 |------------------------------------------------------

//    ----------------------------| HomeWork Task 4 |----------------------------------------------------------
        /*Scanner userNumberScanner3 = new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        int userNumber3 = userNumberScanner3.nextInt();
        if (userNumber3 % 5 == 0) {
            System.out.println(userNumber3 + " number is a multiple of a 5.");
        } else {
            System.out.println(userNumber3 + " number isn't a multiple of a 5.");
        }*/
//    ----------------------------| End HomeWork Task 4 |------------------------------------------------------

//    ----------------------------| HomeWork Task 5 |----------------------------------------------------------
        /*Scanner userNumberScanner4 = new Scanner(System.in);
        System.out.print("Please Enter Your 1-st Number: ");
        int a = userNumberScanner4.nextInt();
        System.out.print("Please Enter Your 2-nd Number: ");
        int b = userNumberScanner4.nextInt();
        System.out.print("Please Enter Your 3-rd Number: ");
        int c = userNumberScanner4.nextInt();
        boolean ac = a > c;
        boolean ab = a > b;
        boolean bc = b > c;
        boolean ba = b > a;
        boolean ca = c > a;
        boolean cb = c > b;
        if (ab && ac) {
            System.out.println("1-st Number is the greatest number.");
        } else if(bc && ba){
            System.out.println("2-st Number is the greatest number.");
        } else if(cb && ca){
            System.out.println("3-st Number is the greatest number.");
        }*/
//    ----------------------------| End HomeWork Task 5 |------------------------------------------------------

//    ----------------------------| HomeWork Task 9 |----------------------------------------------------------
        /*//      ----------| Task 9 -- 1 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter 1-st Number: ");
        int a = numberConsole.nextInt();
        System.out.print("Please Enter 2-nd Number: ");
        int b = numberConsole.nextInt();
        if (a > 10 && b != 10){
            System.out.println("Both a and b legal");
        } else if (a > 10) {
            System.out.println("a is legal b is illegal");
        } else if (b != 0) {
            System.out.println("b is legal a is illegal");
        } else{
             System.out.println("Both a and b illegal");
        }
//      ----------| End Task 9 -- 1 |----------------------*/

        /*//      ----------| Task 9 -- 2 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter 1-st Number: ");
        int a = numberConsole.nextInt();
        System.out.print("Please Enter 2-nd Number: ");
        int b = numberConsole.nextInt();
        if (a > 0 && b > 0){
            System.out.println("Both a and b legal");
        } else if (a > 0) {
            System.out.println("a is legal b is illegal");
        } else if (b > 0) {
            System.out.println("b is legal a is illegal");
        } else{
            System.out.println("Both a and b illegal");
        }
//      ----------| End Task 9 -- 1 |----------------------*/

        /*//      ----------| Task 9 -- 3 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter 1-st Number: ");
        int a = numberConsole.nextInt();
        System.out.print("Please Enter 2-nd Number: ");
        int b = numberConsole.nextInt();
        if (a < 0 && b < 0){
            System.out.println("Both a and b legal");
        } else if (a < 0) {
            System.out.println("a is legal b is illegal");
        } else if (b < 0) {
            System.out.println("b is legal a is illegal");
        } else{
            System.out.println("Both a and b illegal");
        }
//      ----------| End Task 9 -- 3 |----------------------*/

        /*//      ----------| Task 9 -- 4 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter 1-st Number: ");
        int a = numberConsole.nextInt();
        System.out.print("Please Enter 2-nd Number: ");
        int b = numberConsole.nextInt();
        if ((a > 10 && b < 1) && (a % 2 != 0 && b % 2 != 0)) {
            System.out.println("Both a and b legal");
        } else if (a > 10 && a % 2 != 0) {
            System.out.println("a is legal b is illegal");
        } else if (b < 1 && b % 2 != 0) {
            System.out.println("b is legal a is illegal");
        } else {
            System.out.println("Both a and b illegal");
        }
//      ----------| End Task 9 -- 4 |----------------------*/

        /*//      ----------| Task 9 -- 5 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter 1-st Number: ");
        int a = numberConsole.nextInt();
        System.out.print("Please Enter 2-nd Number: ");
        int b = numberConsole.nextInt();
        if (a % 5 ==0 || b % 5 ==0) {
            System.out.println("Both a and b legal");
        } else{
            System.out.println("Both a and b illegal");
        }
//      ----------| End Task 9 -- 5 |----------------------*/

        /*//      ----------| Task 9 -- 6 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter 1-st Number: ");
        int a = numberConsole.nextInt();
        System.out.print("Please Enter 2-nd Number: ");
        int b = numberConsole.nextInt();
        if (a % 5 != 0 && b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else if (a % 5 != 0) {
            System.out.println("a is legal b is illegal");
        } else if (b % 5 == 0) {
            System.out.println("b is legal a is illegal");
        } else{
            System.out.println("Both a and b illegal");
        }
//      ----------| End Task 9 -- 6 |----------------------*/
//    ----------------------------| End HomeWork Task 9 |------------------------------------------------------

//    ----------------------------| HomeWork Task 10 |---------------------------------------------------------
        /*Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter 1-st Number: ");
        int a = numberConsole.nextInt();
        System.out.print("Please Enter 2-nd Number: ");
        int b = numberConsole.nextInt();
        if ((a % 7 == 0 || b % 7 == 0) && (a > 0 && b > 0) && (a > b)) {
            for (int i = b; i < a; i++)
                if (i % 2 != 0) {
                    System.out.println(i);
                }
        } else{
            if (a > b){
                for (int i = b; i < a; i++)
                    if (i % 2 == 0) {
                        System.out.println(i);
                    };
            }else if (b > a){
                for (int i = a; i < b; i++)
                    if (i % 2 == 0) {
                        System.out.println(i);
                    };
            } else{
                System.out.println("Error!!");
            }
        }*/
//    ----------------------------| End HomeWork Task 10 |-----------------------------------------------------

//    ----------------------------| HomeWork Task 11 |---------------------------------------------------------

//    ----------------------------| End HomeWork Task 11 |-----------------------------------------------------

//    ----------------------------|~\~\ END DAY 4 Home Work /~/~|----------------------------------------------


//    ----------------------------|~\~\ DAY 3 Home Work /~/~|--------------------------------------------------

//    ----------------------------| HomeWork Task 1 |----------------------------------------------------------
        /*//----------| Task 1 -- 1 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter Double : ");
        double a = numberConsole.nextDouble();
        float b = (float) a;
        System.out.println("Double is : "+a+"\nFloat is : "+b);
        //------------| End Task 1 -- 1 |----------------------*/

        /*//----------| Task 1 -- 2 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter Short : ");
        short a = numberConsole.nextShort();
        int b = a;
        System.out.println("Short is : "+a+ "\nInt is : "+b);
        //------------| End Task 1 -- 2 |----------------------*/

        /*//----------| Task 1 -- 3 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter Int : ");
        int  a = numberConsole.nextInt();
        short b = (short) a;
        System.out.println("Int is : "+a+ "\nShort is : "+b);
        //------------| End Task 1 -- 3 |----------------------*/

        /*//----------| Task 1 -- 4 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter Long : ");
        long   a = numberConsole.nextLong();
        float b = a;
        System.out.println("Long is : "+a+ "\nFloat is : "+b);
        //------------| End Task 1 -- 4 |----------------------*/

        /*//----------| Task 1 -- 5 |----------------------
        Scanner numberConsole = new Scanner(System.in);
        System.out.print("Please Enter Float : ");
        float   a = numberConsole.nextFloat();
        double b = a;
        System.out.println("Float is : "+a+ "\nDouble is : "+b);
        //------------| End Task 1 -- 5 |----------------------*/
//    ----------------------------| End HomeWork Task 1 |------------------------------------------------------

//    ----------------------------| HomeWork Task 3 |----------------------------------------------------------
        /*Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");*/
//    ----------------------------| End HomeWork Task 3 |------------------------------------------------------

//    ----------------------------| HomeWork Task 3 |----------------------------------------------------------
        /*//----------| Task 3 -- 1 |----------------------
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        //----------| End Task 3 -- 1 |----------------------*/

        /*//----------| Task 3 -- 2 |----------------------
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextFloat();
        float  celsius =(( 5f *((float)fahrenheit - 32.0f)) / 9.0f);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        //----------| End Task 4 -- 2 |----------------------*/

        /*//----------| Task 3 -- 3 |----------------------
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextFloat();
        int  celsius =(( 5 *((int)fahrenheit - 32)) / 9);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        //----------| End Task 4 -- 3 |----------------------*/
//    ----------------------------| End HomeWork Task 3 |------------------------------------------------------

//    ----------------------------| HomeWork Task 5 |----------------------------------------------------------
        /*double result1 = 1/3;
        float result2 = 1/3;
        System.out.println(result1 + "\n" + result2);*/

//    ----------------------------| End HomeWork Task 5 |----------------------------------------------------------

//    ----------------------------| HomeWork Task 6 |----------------------------------------------------------
        /*Scanner input = new Scanner(System.in);
        System.out.print("Please Your Name : ");
        String s = input.next();
        System.out.print("Please Your year of birth : ");
        int number = input.nextInt();
        System.out.println(s +" "+number);*/

//    ----------------------------| End HomeWork Task 6 |----------------------------------------------------------

//    ----------------------------| HomeWork Task 7 |----------------------------------------------------------
        /*char x = 'a';
        int a = x;
        System.out.println(x+"\n"+a);*/
//    ----------------------------| End HomeWork Task 7 |----------------------------------------------------------

//    ----------------------------| HomeWork Task 8 |--------------------------------------------------------------
        /*Scanner input = new Scanner(System.in);
        String s = input.next();
        int parseInt = s.length();
        int sum = 0;
        int i = 1;
        for (i = 1; i <= parseInt; i++){
            sum += i;
        }
        i = i - 1;
        float result = sum / i;
        System.out.println(result);*/
//    ----------------------------| End HomeWork Task 8 |------------------------------------------------------

//    ----------------------------| HomeWork Task 12 |---------------------------------------------------------
        /*String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);*/
//    ----------------------------| END HomeWork Task 12 |-----------------------------------------------------

//    ----------------------------| HomeWork Task Test |-------------------------------------------------------
        /* 1) Which data type would you use to represent the following values?
     a. Child age
     b. Employee salary
     c .Whether somebody has children or not
     d. Apartment letter

     ---| Answer |-----
     a. - int
     b. - int
     c. - boolean
     d. - float
     */

        /* 2) Find the errors in the following Java sentences:
         a) int a, b, c a = 0
         b) System.out.println('ab');
         c) System.out.println( (3 + 2) – 1) );
         d) int a = 3.2; e) float a = 2.1; int c = a;
         f) int i = 10; float b; i = b;
         g) int x; { x = 10; } System.out.println(x);
         h) boolean a, b; a = false, b = true;
         i) int x; x = 1; r = x + 1;
         j) String s = 'This is a string';

         ---| Answer |---
         a) int a, b, c; a = 0;
         b) System.out.println("ab");
         c) System.out.println( (3 + 2) – 1 );
         d) float a = 3.2f;
         e) float a = 2.1f; int c = (int) a;
         f) int i = 10; float b = 0.7f; i = (int)b;
         g) int x; { x = 10; } System.out.println(x);   ---| ??{ x = 10; }?? |---
         h) boolean a, b; a = false; b = true;
         i) int x; x = 1; int r = x + 1;
         j) String s = "This is a string";
          */

        /* 3)What will be output
        int i = 10;
        int n = i++ % 5;

        ---| Answer |---
        int n = 11 % 5 = 1
            */

        /* 4) Find the value of the variable result after executing the following sentences:
                int a;
                int b;
                int result;
                  a) a = 4; b = 12; result = a + b / 3;
                  b) a = 3; a = a + 3; b = 2; result = a – b;
                  c) a = 2; b = a + 1; a = b + 2; result = a + b + a; result = -result;
                  d) a = 3; b = 11; result = (b % a) + 1;
                  e) a = 3; b = a++; result = 1; result += a – b;


           ---| Answer |---
           a) ~ 5.3
           b) 4
           c) -11
           d) 3
           e) 0
 */
//    ----------------------------| End HomeWork Task Test |---------------------------------------------------

//    ----------------------------|~\~\ END DAY 3 Home Work /~/~|----------------------------------------------


//    ----------------------------|~\~\ END DAY 5 Home Work /~/~|----------------------------------------------

//    ----------------------------| HomeWork Task 1 |---------------------------------------------------------
        /*Scanner userText = new Scanner(System.in);
        String x = userText.nextLine();
        String y = userText.nextLine();
        if (x == y) {                // ------------| ?? |--------------
            System.out.println("OK!");
        } else {
            System.out.println("error");
        }*/
//    ----------------------------| End HomeWork Task 1 |-----------------------------------------------------

//    ----------------------------| Ternary Operator |---------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter First Number : ");
        int x = scanner.nextInt();
        System.out.print("Please Enter Second Number : ");
        int y = scanner.nextInt();
        System.out.print("Please Enter Third Number : ");
        int z = scanner.nextInt();
        String south = (x > y) && (x > z) ? "1-st Number is the biggest" : (y > x) && (y > z) ? "2-nd Number is the biggest" : (z > x) && (z > y) ? "3-rd Number is the biggest" : "All number's are equal";
        System.out.println(south);*/
//    ----------------------------| End Ternary Operator |-----------------------------------------------------

//    ----------------------------| HomeWork Task 10--1 |---------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Small letter : ");
        char ch = scanner.nextLine().charAt(0);
        switch(ch){
            case 'a':
                System.out.println(ch + " is Vowel");
                break;
            case 'e':
                System.out.println(ch + " is Vowel");
                break;
            case 'i':
                System.out.println(ch + " is Vowel");
                break;
            case 'o':
                System.out.println(ch + " is Vowel");
                break;
            case 'u':
                System.out.println(ch + " is Vowel");
                break;
            case 'y':
                System.out.println(ch + " is Vowel");
                break;
            default:
                System.out.println(ch + " isn't Vowel");
                break;
        }*/
//    ----------------------------| End HomeWork Task 10--1 |-----------------------------------------------------

//    ----------------------------| HomeWork Task 10--2 |---------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Number : ");
        int x = scanner.nextInt();
        switch (x){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Allowed");
                break;
            default:
                System.out.println("Not Allowed");
                break;
        }*/
//    ----------------------------| End HomeWork Task 10--2 |-----------------------------------------------------

//    ----------------------------| HomeWork Task 11 |---------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Number : ");
        int x = scanner.nextInt() % 2;
        switch (x){
            case 0:
                System.out.println("Number is Even!");
                break;
            default:
                System.out.println("Number is Odd!");
                break;
        }*/
//    ----------------------------| End HomeWork Task 11 |-----------------------------------------------------

//    ----------------------------| HomeWork Task 12 |---------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input (+, -, *, /) : ");
        String y = scanner.next();
        System.out.print("Please Input First Number : ");
        int a = scanner.nextInt();
        System.out.print("Please Input Second Number : ");
        int b = scanner.nextInt();
        switch (y){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Error!");
                break;
        }*/
//    ----------------------------| End HomeWork Task 12 |-----------------------------------------------------

//    ----------------------------| HomeWork Task 13 |---------------------------------------------------------

//    ----------------------------| End HomeWork Task 13 |-----------------------------------------------------

//    ----------------------------| HomeWork Task 14 |---------------------------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Average Score : ");
        int a = scanner.nextInt() / 20;
        switch (a){
            case 0:
            case 1:
                System.out.println("Your grade is F.");
            break;
            case 2:
                System.out.println("Your grade is C.");
                break;
            case 3:
                System.out.println("Your grade is B.");
                break;
            case 4:
                System.out.println("Your grade is A.");
                break;
            default:
                System.out.println("Error!");
        }*/
//    ----------------------------| End HomeWork Task 14 |-----------------------------------------------------

//    ----------------------------|~\~\ END DAY 5 Home Work /~/~|----------------------------------------------


    }
}
