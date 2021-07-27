package com.christianpari;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidEmail {

  public void startAlg() {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();

    System.out.println(isValidEmail(input));
  }

  private Boolean isValidEmail(String email) {
    return Pattern.matches("[a-z]{1,6}_?0?[0-9]{0,4}@hackerrank.com$", email);
  }
}
