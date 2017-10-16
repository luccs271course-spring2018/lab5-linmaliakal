package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order

    final Scanner input = new Scanner(System.in);
    String line;
    LinkedStack<String> stackReverse = new LinkedStack<String>();
    while ((line = input.nextLine()) != null) {
      // System.out.println(line);
      stackReverse.push(line);
    }
    input.close();
    while (!stackReverse.isEmpty()) {
      System.out.println(stackReverse.pop());
    }
  }
}
