package homeworkTwo;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println("1.uzdevums [a]");
        int x = 10;
        int y = 7;
        if (x > 0)
            System.out.println("x>0");
            System.out.println("\n");
            System.out.println("1.uzdevums [b]");
            if (x < 0) {
                System.out.println("x<0");
            } else {
                System.out.println("FALSE");
            }
            System.out.println("\n");
            System.out.println("1.uzdevums [c]");
            if (x > 5 && x <= 10) {
                System.out.println("5<x<=10");
            }
            System.out.println("\n");
            System.out.println("1.uzdevums [d]");
            if (y >= 5 && y < 10) {
                System.out.println("5=<y<10");
            }
            System.out.println("\n");
            System.out.println("1.uzdevums [e]");
            if (y == 0 || y == 10) {
                System.out.println("y=0 and y=10");
            } else {
                System.out.println("FALSE");
            }
            System.out.println("\n");
            System.out.println("1.uzdevums [f]");
            if (x * x > 10) {
                System.out.println("x*x > 10");
            }
            System.out.println("\n");
//////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("2.uzdevums");
            Scanner monthNumber = new Scanner(System.in);
            int month;
            System.out.println("Enter the numerical value of the month: ");
            month = monthNumber.nextInt();
            switch (month) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Such a month does not exist!");
            }
            System.out.println("\n");
//////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("3.uzdevums");
            Scanner number = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a = number.nextInt();
            System.out.println("Enter second number: ");
            int b = number.nextInt();
            System.out.println("Enter third number: ");
            int c = number.nextInt();
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            System.out.println("The largest of the three numbers is: " + max);
        System.out.println("\n");
//////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("4.uzdevums");
        System.out.println("Enter traffic light colour: ");
        Scanner lightColour = new Scanner(System.in);
        String input = lightColour.next();
        switch (input) {
            case "Red":
                System.out.println("STOP!");
                break;
            case "Yellow":
                System.out.println("WAIT!");
                break;
            case "Green":
                System.out.println("GO!");
                break;
            default:
                System.out.println("Be careful the traffic light is not working!");
        }
        System.out.println("\n");
//////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("5.uzdevums");
        printBusinessCard("Vizītkarte", "###################", "Jānis", "Bērziņš", "+371 21234567", 1990);
        System.out.println("\n");
//////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("6.uzdevums");
        printBusinessCardTwo("Vizītkarte", "###################", "Jānis", "Linda", "Bērziņš", "Bērziņa", "+371 21234567", "+371 21234777", 1985, 1990);
        System.out.println("\n");
//////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("7.uzdevums");
        System.out.println(sum(1,2));
        System.out.println("\n");
//////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("8.uzdevums");
        System.out.println(average(3,2,6));
    }
    public static void printBusinessCard(String businessCard, String symbol, String name, String surName, String phoneNumber, int yearOfBirth) {
        System.out.printf("%s%n %s%n Vārds: %s%n Uzvārds: %s%n Telefona numurs: %s%n Dzimšanas gads: %s%n %s%n", businessCard, symbol, name, surName, phoneNumber, yearOfBirth, symbol);
        System.out.printf("%s%n %s%n Vārds: %s%n Uzvārds: %s%n Telefona numurs: %s%n Dzimšanas gads: %s%n %s%n", businessCard, symbol, name, surName, phoneNumber, yearOfBirth, symbol);
        System.out.printf("%s%n %s%n Vārds: %s%n Uzvārds: %s%n Telefona numurs: %s%n Dzimšanas gads: %s%n %s%n", businessCard, symbol, name, surName, phoneNumber, yearOfBirth, symbol);
        System.out.println("\n");
    }
    public static void printBusinessCardTwo(String businessCard, String symbol, String name1, String name2, String surName1, String surName2, String phoneNumber1, String phoneNumber2, int yearOfBirth1, int yearOfBirth2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first person name");
        name1 = scanner.nextLine();
        System.out.println("Please enter first person surname");
        surName1 = scanner.nextLine();
        System.out.println("Please enter first person phone number");
        phoneNumber1 = scanner.nextLine();
        System.out.println("Please enter first person year of birth");
        yearOfBirth1 = scanner.nextInt();
        //System.out.println("\n");
        System.out.println("Please enter second person name");
        name2 = scanner.next();
        System.out.println("Please enter second person surname");
        surName2 = scanner.next();
        System.out.println("Please enter second person phone number");
        phoneNumber2 = scanner.next();
        System.out.println("Please enter second person year of birth");
        yearOfBirth2 = scanner.nextInt();
        System.out.printf("%s%n %s%n Vārds: %s%n Uzvārds: %s%n Telefona numurs: %s%n Dzimšanas gads: %s%n %s%n", businessCard, symbol, name1, surName1, phoneNumber1, yearOfBirth1, symbol);
        System.out.printf("%s%n %s%n Vārds: %s%n Uzvārds: %s%n Telefona numurs: %s%n Dzimšanas gads: %s%n %s%n", businessCard, symbol, name2, surName2, phoneNumber2, yearOfBirth2, symbol);
        System.out.println("\n");
    }
    public static int sum(int num1, int num2) {
        Scanner sum = new Scanner(System.in);
        System.out.println("Please enter first number");
        num1 = sum.nextInt();
        System.out.println("Please enter second number");
        num2 = sum.nextInt();
        return num1 + num2;
    }
    public static double average(double num3, double num4, double num5) {
        Scanner average = new Scanner(System.in);
        System.out.println("Please enter first number");
        num3 = average.nextDouble();
        System.out.println("Please enter second number");
        num4 = average.nextDouble();
        System.out.println("Please enter third number");
        num5 = average.nextDouble();
        return (num3 + num4 + num5)/3;
    }
}



