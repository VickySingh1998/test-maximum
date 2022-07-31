package com.bridgelabz;

public class Maximum <X extends Comparable> {
    X a, b, c;

    public Maximum(X a, X b, X c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public X testMaximum() {

        X max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Maximum<Integer> resultInt = new Maximum<>(67, 76, 24);
        Maximum<Float> resultFloat = new Maximum<>(23.3f, 45.7f, 28.9f);
        Maximum<String> resultString = new Maximum<>("Vicky", "Raja", "Shane");
        System.out.println("The Maximum Integer Number Is : " +resultInt.testMaximum());
        System.out.println("The Maximum Float Number Is : " +resultFloat.testMaximum());
        System.out.println("The Maximum String Is : " +resultString.testMaximum());
    }
}

