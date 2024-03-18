package com.foxminded.lenskyi.algorithms.exponentiation;

public class ExponentiationBySquaring {

  public static long power(long base, long exponent) {
    if (exponent < 0) {
      throw new IllegalArgumentException("Exponent cannot be negative.");
    }

    // Base case: If exponent is 0, result is 1
    if (exponent == 0) {
      return 1;
    }

    // If exponent is even
    if (exponent % 2 == 0) {
      long result = power(base, exponent / 2);
      return result * result;
    } else {
      // If exponent is odd
      long result = power(base, (exponent - 1) / 2);
      return base * result * result;
    }
  }

  private static long regularExponent(long base, long exp) {
    long result = 1;
    while (exp > 0) {
      result = result * base;
      exp--;
    }
    return result;
  }

  public static void main(String[] args) {
    long base = 2;
    long exponent = 62;
    long start = System.currentTimeMillis();
    long result = power(base, exponent);
    long end = System.currentTimeMillis() - start;
    System.out.println(
        base + " raised to the power of " + exponent + " is: " + result + " with time: " + end);
  }
}
