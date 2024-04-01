package com.perscholas.lesson30312;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HackerRankExceptions {

  public static void TryCatch() {
    TryCatchCode(new Scanner(System.in));
  }
  public static void TryCatch(String in) {
    TryCatchCode(new Scanner(in));
  }

  public static void Handling() {
    HandlingCode(new Scanner(System.in));
  }

  public static void Handling(String in) {
    HandlingCode(new Scanner(in));
  }

  private static void TryCatchCode(Scanner sc) {
    try {
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println(x / y);
    } catch (InputMismatchException e) {
      System.out.println("java.util.InputMismatchException");
    } catch (Exception e) { System.out.println(e); }
  }

  private static void HandlingCode(Scanner in) {
    final MyCalculator my_calculator = new MyCalculator();
    while (in .hasNextInt()) {
      int n = in .nextInt();
      int p = in .nextInt();

      try {
        System.out.println(my_calculator.power(n, p));
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class MyCalculator {
  /*
   * Create the method long power(int, int) here.
   */
  public long power(int n, int p) throws Exception {
    if (n == 0 & p == 0) {
      throw new Exception("n and p should not be zero.");
    }
    if (n < 0 || p < 0) {
      throw new Exception("n or p should not be negative.");
    }
    long output = 1;
    for (; p > 0; p--) {
      output *= n;
    }
    return output;
  }
}