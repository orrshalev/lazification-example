package com.org.lazyexample;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {
        for (int i = 0; i < 100_000; i++) {
            CallByNeed.caller("2", new int[] {1, 2, 3, 4}, 4);
        }
        for (int i = 0; i < 100_000; i++) {
            CallByValue.caller("2", new int[] {1, 2, 3, 4}, 4);
        }
    }
}
