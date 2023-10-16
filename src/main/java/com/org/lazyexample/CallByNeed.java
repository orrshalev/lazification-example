package com.org.lazyexample;

public class CallByNeed {
    private static abstract class Thunk {
        abstract int f(); // int is typeof value
        // values captured in backwards slice
        String s0;
        int[] keys;
        int N;
        // values for memoization
        int val;
        boolean memo;
    }
    private static void calee(int key, Thunk tk, int N) {
        for (int i = 0; i < N; i++) {
            if (key != 0 && tk.f() < N) {
                System.out.printf("User has access, iteration = %d\n", i);
            }
        }
    }
    public static void caller(String s0, int[] keys, int N) {
        int key = Integer.parseInt(s0);
        Thunk value_thunk = new Thunk() {
            @Override
            int f() {
                if (this.memo) return this.val;
                int key = Integer.parseInt(s0);
                int value = -1;
                for (int i = 0; i < this.N; i++) {
                    if (this.keys[i] == key) {
                        value = i;
                    }
                }
                this.val = value;
                this.memo = true;
                return value;
            }
        };
        value_thunk.memo = false;
        value_thunk.s0 = s0;
        value_thunk.keys = keys;
        value_thunk.N = N;
        calee(key, value_thunk, N);
    }
}
