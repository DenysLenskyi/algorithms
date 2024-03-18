package com.foxminded.lenskyi.algorithms.euclidean;

public class GCD {

  public static int findGCD(int a, int b) {
    // Ensure that both numbers are positive
    a = Math.abs(a);
    b = Math.abs(b);

    // Apply Euclidean algorithm
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
      System.out.println(a);
      System.out.println(b);
      System.out.println(temp);
    }
    return a;
  }

  public static void main(String[] args) {
    int num1 = 48;
    int num2 = 18;

    int gcd = findGCD(num1, num2);
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
  }
}
