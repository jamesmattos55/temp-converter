package edu.cnm.deepdive;

import java.util.Scanner;

public class TempConverter {

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean beginProgram;

    beginProgram = input.nextBoolean();
    if (beginProgram) {
      boolean goAgain;

      do {
        double celsius;
        double fahrenheit;
        System.out.print("Enter a temperature in Fahrenheit; ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
        System.out.print("Convert another (true/false)");
        goAgain = input.nextBoolean();
      } while (goAgain);
    }
  }
}
