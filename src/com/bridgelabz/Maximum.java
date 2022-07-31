package com.bridgelabz;

//import java.util.Scanner;

public class Maximum {
    public static Integer maximumInteger(Integer number1, Integer number2, Integer number3) {
        Integer max = number1;
        if (number2.compareTo(max) > 0) {
            max = number2;
        }
        if (number3.compareTo(max) > 0) {
            max=number3;
        }
        return max;
    }

    public static Float maximumFloat(Float number1, Float number2, Float number3) {
        Float max = number1;
        if (number2.compareTo(max) > 0) {
            max = number2;
        }
        if (number3.compareTo(max) > 0) {
            max = number3;
        }
        return max;
    }

    public static String maximumString(String string1, String string2, String string3) {
        String max = string1;
        if (string2.compareTo(max) > 0) {
            max = string2;
        }
        if (string3.compareTo(max) > 0) {
            max = string3;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer resultInt =  maximumInteger(67, 76, 24);
        Float resultFloat = maximumFloat((float)23.3, (float) 45.7, (float) 28.9);
        String resultString = maximumString("Vicky", "Raja", "Deep");
        System.out.println("The Maximum Integer Number Is : " +resultInt);
        System.out.println("The Maximum Float Number Is : " +resultFloat);
        System.out.println("The Maximum String Name Name Is : " +resultString);
    }
}

