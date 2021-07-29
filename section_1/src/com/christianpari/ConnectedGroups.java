package com.christianpari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConnectedGroups {

  public void startAlg() {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int inc = 0;
    List<String> matrix = new ArrayList<>();
    while (inc++ < size) {
      String binary = sc.next();
      matrix.add(binary);
    }

    System.out.println(countGroups(matrix));
  }

  private int countGroups(List<String> matrix) {
    int groups = 0;

    for (int i = 0; i < matrix.size(); i++) {
      if (Integer.parseInt(String.valueOf(matrix.get(i).charAt(i))) == 1) {
        groups++;
        dfs(matrix, i);
      }
    }

    return groups;
  }

  private void dfs(List<String> matrix, int vertex) {
    if (Integer.parseInt(String.valueOf(matrix.get(vertex).charAt(vertex))) == 0) { return; }

    for (int i = 0; i < matrix.size(); i++) {
      if (Integer.parseInt(String.valueOf(matrix.get(vertex).charAt(i))) == 1) {
        List<String> binary = Arrays.asList(matrix.get(vertex).split(""));
        binary.set(i, "0");
        String newB = String.join("", binary);
        matrix.set(vertex, newB);
        dfs(matrix, i);
      }
    }
  }
}
