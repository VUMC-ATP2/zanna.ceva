package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////
        System.out.println("1.uzdevums");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (sum < 100) {
            System.out.println("Enter number:");
            int enteredNumber = scanner.nextInt();
            sum = sum + enteredNumber;
        }
                System.out.println("Sum: " + sum);

        ////////////////////////////////////////////////////////////////////
        System.out.println("2.uzdevums");
        Scanner primeOrNot = new Scanner(System.in);
        System.out.println("Please enter number: ");
        num = primeOrNot.nextInt();
        int i, m = 0, flag = 0;
        m = num / 2;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " is prime number");
            }
            ////////////////////////////////////////////////////////////////////
            System.out.println("3.uzdevums");
            int[] monthOfYear = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            String[] summerMonth = new String[]{"June", "July", "August"};
            char[] summer = {'S', 'U', 'M', 'M', 'E', 'R', '!'};
            //////////// while ////////////////////////////////////////////////
            int number = 0;
            while (number < monthOfYear.length) {
                System.out.print(monthOfYear[number] + " ");
                number++;
            }
            System.out.println("");
            int month = 0;
            while (month < summerMonth.length) {
                System.out.print(summerMonth[month] + " ");
                month++;
            }
            System.out.println("");
            int letter = 0;
            while (letter < summer.length) {
                System.out.print(summer[letter] + " ");
                letter++;
            }
            System.out.println("");
            //////////// do while ////////////////////////////////////////////////
//        do {
//            System.out.println(monthOfYear[number]);
//            number++;
//        } while (number ==10);
//        do {
//          System.out.println(summerMonth[month]);
//           month++;
//       } while (month ==2);
//        do {
//            System.out.println(summer[letter]);
//            letter++;
//        } while (letter < summer.length);
            //////////// for loop ////////////////////////////////////////////////
            for (number = 0; number <= 11; number++) {
                System.out.print(monthOfYear[number] + " ");
            }
            System.out.println("");
            for (month = 0; month <= 2; month++) {
                System.out.print(summerMonth[month] + " ");
            }
            System.out.println("");
            for (letter = 0; letter <= 6; letter++) {
                System.out.print(summer[letter] + " ");
            }
            System.out.println("");
            //////////// for each ////////////////////////////////////////////////
            for (int number1 : monthOfYear) {
                System.out.print(number1 + " ");
            }
            System.out.println("");
            for (String month1 : summerMonth) {
                System.out.print(month1 + " ");
            }
            System.out.println("");
            for (char letter1 : summer) {
                System.out.print(letter1 + " ");
            }
            System.out.println("");
            ////////////////////////////////////////////////////////////////////
            System.out.println("4.uzdevums");
            int[] numArray = new int[100];
            for (int j = 1; j <= 100; j++) {
                if (j % 2 != 0) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println("");
            ////////////////////////////////////////////////////////////////////
            System.out.println("5.uzdevums");
            int f = 1;
            Scanner fakt = new Scanner(System.in);
            System.out.println("Lūdzu ievadiet ciparu: ");
            int numFakt = fakt.nextInt();
            for (i = 1; i <= numFakt; i++) {
                f = f * i;
            }
            System.out.println("Faktoriāls no " + numFakt + " = " + f);
////////////////////////////////////////////////////////////////////
            System.out.println("6.uzdevums");
            final int yourPin = 777;
            int pinMeginajumi = 0;
            Scanner pinKods = new Scanner(System.in);
            System.out.println("Lūdzu ievadiet PIN: ");
            int pin = pinKods.nextInt();
            pinMeginajumi++;
            while (pin != yourPin && pinMeginajumi < 3) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz! Lūdzu ievadiet PIN:");
                pin = pinKods.nextInt();
                pinMeginajumi++;
            }
            if (pin == yourPin)
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ. :0)");
            else if (pinMeginajumi >= 3)
                System.out.println("Atvainojiet, bet Jūs esat bloķēts :0(");
        }
    }
}


