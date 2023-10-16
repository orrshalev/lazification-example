package com.org.lazyexample;

public class CallByValue {
    private static void calee(int key, int value, int N) {
        for (int i = 0; i < N; i++) {
            if (key != 0 && value < N) {
                System.out.printf("User has access, iteration = %d\n", i);
            }
        }
    }
    public static void caller(String s0, int[] keys, int N) {
        int key = Integer.parseInt(s0);
        int value = -1;
        for (int i = 0; i < N; i++) {
            if (keys[i] == key) {
                value = i;
            }
        }
        calee(key, value, N);
    }
}
