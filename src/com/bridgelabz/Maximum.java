package com.bridgelabz;

import java.util.Scanner;

public class Maximum {
    public static Integer maximumInteger(Integer number1, Integer number2, Integer number3) {
        Integer max = number1;
        if (number2.compareTo(max) > 0) {
            max = number2;
        }
        if (number3.compareTo(max) > 0) {
            max = number3;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter Third Number : ");
        int number3 = scanner.nextInt();

        System.out.println("The Maximum Integer Is : " +maximumInteger(number1, number2, number3));
    }
}

