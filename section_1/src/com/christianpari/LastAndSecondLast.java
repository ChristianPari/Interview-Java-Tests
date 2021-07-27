package com.christianpari;

import java.util.Scanner;

public class LastAndSecondLast {

  public void startAlg() {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();

    System.out.println(getLast(input));
  }

  private String getLast(String input) {
    return input.charAt(input.length() - 1) + " " + input.charAt(input.length() - 2);
  }
}
