package ru.itis.inform.Version1ByArray;

/**
 * Created by Марат on 14.02.2016.
 */
public class RationalNumber {
    private int a;
    private int b;

    public RationalNumber() {
        this.a = 0;
        this.b = 1;
    }

    public RationalNumber(int a, int b) {
        this.a = a;
        if (b == 0) {
            throw new IllegalArgumentException();
        } else this.b = b;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
