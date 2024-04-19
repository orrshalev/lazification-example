package com.org.lazyexample;

public class CallByValue {
  private static void bloatedCalee(int key, int value, int N, int irrelivent) {
    for (int i = 0; i < N; i++) {
      if (key != 0 && value < N) {
        System.err.printf("User has access, iteration = %d %d\n", i, irrelivent);
      }
    }
  }

  public static void blodatedCaller(String s0, int[] keys, int N) {
    int irrelivent = Integer.parseInt(s0.substring(0, 1));
    int key = Integer.parseInt(s0);
    int value = -1;
    for (int i = 0; i < N; i++) {
      if (keys[i] == key) {
        value = i;
      }
    }
    bloatedCalee(key, value, N, irrelivent);
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

  private static void calee(int key, int value, int N) {
    for (int i = 0; i < N; i++) {
      if (key != 0 && value < N) {
        System.err.printf("User has access, iteration = %d\n", i);
      }
    }
  }

  public static void callerWithCallInLoop(String s0, int[] keys, int N) {
    int key = Integer.parseInt(s0);
    int value = -1;
    for (int i = 0; i < N; i++) {
      value = i;
      calee(key, value, N);
    }
  }
}
