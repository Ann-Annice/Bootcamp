package com.nest.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int choice, x, y, z;
        System.out.println("calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value:");
        x = scanner.nextInt();
        System.out.println("enter second value");
        y = scanner.nextInt();

        while (true) {

            System.out.println("1.Add two numbers");
            System.out.println("2.Subtract two numbers");
            System.out.println("3.Divide two numbers");
            System.out.println("4.Multiply two numbers");
            System.out.println("5.exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    z = x + y;
                    System.out.println(z);

                    break;
                case 2:
                    z = x - y;
                    System.out.println(z);
                    break;
                case 3:
                    z = x / y;
                    System.out.println(z);
                    break;
                case 4:
                    z = x * y;
                    System.out.println(z);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
