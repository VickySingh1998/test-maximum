package com.bridgelabz;

//import java.util.Scanner;

public class Maximum {
    public static Integer maximumInteger(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static Float maximumFloat(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static String maximumString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer resultInt =  maximumInteger(67, 76, 24);
        Float resultFloat = maximumFloat((float)23.3, (float) 45.7, (float) 28.9);
        String resultString = maximumString("Vicky", "Raja", "Deep");
        System.out.println("The Maximum Integer Number Is : " +resultInt);
        System.out.println("The Maximum Float Number Is : " +resultFloat);
        System.out.println("The Maximum String Is : " +resultString);
    }
}

