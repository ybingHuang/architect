package com.ybing.architect.base;

public class FinalTest {

    private final String KEY ;

    public FinalTest(String key) {
        this.KEY = key;
    }

    public static void main(String[] args) {
        final int i = 0;
        final Integer ii  = 0;
        //ii = 1;
        //i = 2;
        final String str = new String("ab");

    }
}
