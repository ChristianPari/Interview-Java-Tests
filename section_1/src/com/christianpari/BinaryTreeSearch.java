// july 21
package com.christianpari;

import java.util.Scanner;

public class BinaryTreeSearch {

  public void startAlg() {
    Scanner sc = new Scanner(System.in);
    int treeSize = sc.nextInt();
    Node root = new Node(sc.nextInt());
    int cnt = 0;
    while (cnt++ < treeSize - 1) {
      int v = sc.nextInt();
      root.insert(v);
    }
    int querySize = sc.nextInt();
    int[] q = new int[querySize];
    for (int i = 0; i < querySize; i++) {
      q[i] = sc.nextInt();
    }
    sc.close();
    int[] output = isPresent(root, q);
    for (int eval : output) {
      System.out.println(eval);
    }
  }

  private int[] isPresent(
    Node root,
    int[] query
  ) {
    int[] output = new int[query.length];
    for (int i = 0; i < query.length; i++) {
      output[i] = root.containsNode(query[i]);
    }
    return output;
  }
}

class Node {
  int data;
  Node left = null;
  Node right = null;

  public Node(int data) { this.data = data; }

  public void insert(int val) {
    if (val <= data) {
      if (left == null) {
        left = new Node(val);
      } else {
        left.insert(val);
      }
    } else {
      if (right == null) {
        right = new Node(val);
      } else {
        right.insert(val);
      }
    }
  }

  public int containsNode(int data) {
    if (this.data == data) {
      return 1;
    }
    if (data < this.data) {
      if (left != null) {
        return left.containsNode(data);
      }
    } else {
      if (right != null) {
        return right.containsNode(data);
      }
    }
    return 0;
  }

  public String preOrderTraversalString() {
    String s = data + " ";
    if (left != null) {
      s += left.preOrderTraversalString();
    }
    if (right != null) {
      s += right.preOrderTraversalString();
    }
    return s;
  }
}