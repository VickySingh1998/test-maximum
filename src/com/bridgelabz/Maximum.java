package com.bridgelabz;

public class Maximum {
    public static <X extends Comparable>X maximum(X a, X b, X c) {
        X max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max=c;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer resultInt = maximum(67, 76, 24);
        Float resultFloat = maximum((float)23.3, (float) 45.7, (float) 28.9);
        String resultString = maximum("Vicky", "Raja", "Deep");
        System.out.println("The Maximum Integer Number Is : " +resultInt);
        System.out.println("The Maximum Float Number Is : " +resultFloat);
        System.out.println("The Maximum String Is : " +resultString);
    }
}

