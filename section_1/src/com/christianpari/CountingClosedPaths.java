package com.christianpari;

import java.util.Scanner;

public class CountingClosedPaths {

  public void startAlg() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(closedPaths(n));
  }

  private int closedPaths(int num) {
    int answer = 0;
    while (num > 0) {
      int n = num % 10;
      if (n == 0 || n == 4 || n == 6 || n == 9) {
        answer++;
      }

      if (n == 8) {
        answer += 2;
      }

      num /= 10;
    }
    //    char[] nChars = String.valueOf(num).toCharArray();
    //    for (char c : nChars) {
    //      if (c == '0' || c == '4' || c == '6' || c == '9') {
    //        answer += 1;
    //      }
    //
    //      if (c == '8') {
    //        answer += 2;
    //      }
    //    }
    return answer;
  }
}
