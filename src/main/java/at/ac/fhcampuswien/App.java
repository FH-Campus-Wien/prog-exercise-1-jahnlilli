package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        int a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int sum = a + b + c + (int)d + (int)e + (int)f + (int)g + (int)h ;
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum1 = a + b;
        System.out.println(sum1);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int first = scan.nextInt();
        System.out.print("y: ");
        int second = scan.nextInt();

        System.out.println("After Swap:");
        System.out.println("x: " + second);
        System.out.println("y: " + first);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("n1: ");
        int a = scan.nextInt();

        System.out.print("n2: ");
        int b = scan.nextInt();

        if (a > b)
            System.out.println("n1 > n2");
        else if (a < b)
            System.out.println("n2 > n1");
        else if (a == b)
            System.out.println("n1 == n2");

    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scan.nextInt();
        if (revenue >= 0 && revenue < 20000)
            System.out.println("Poor Sales Revenue");
        else if (revenue >= 20000 && revenue < 50000)
            System.out.println("Average Sales Revenue");
        else if (revenue >= 50000 && revenue < 80000)
            System.out.println("Good Sales Revenue");
        else if (revenue >= 80000 && revenue < 100000)
            System.out.println("Excellent Sales Revenue");
        else
            System.out.println("Invalid Revenue");
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int a = scan.nextInt();

        if (a == 1)
            System.out.println("Your Commission Rate was set to 0.01");
        else if (a == 2)
            System.out.println("Your Commission Rate was set to 0.02");
        else if (a == 3)
            System.out.println("Your Commission Rate was set to 0.03");
        else if (a == 4)
            System.out.println("Your Commission Rate was set to 0.04");
        else
            System.out.println("Your Commission Rate was set to 0.0");
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scan.nextInt();
        if (year % 4 != 0) {
            System.out.println("Not a Leapyear");
        } else if (year % 100 != 0) {
            System.out.println("Leapyear");
        } else if (year % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int givenNumber = scan.nextInt();
        int reversedNumber = 0;

        while (givenNumber != 0) {
            int lastDigit = givenNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            givenNumber /= 10;

        }
            System.out.println(reversedNumber);

        }



    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}