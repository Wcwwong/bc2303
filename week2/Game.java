package week2;

import java.util.Random;
import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    // int 1 -100
    // Keep asking user for the input
    // User can input an integer between a ranger of number (1-100)
    // Bomb -> random number
    // if user input != bomb, revise the range of number
    // if user input == bomb, end game
    // Loop, until user input == bomb

    int bomb = new Random().nextInt(1, 100); // if user input = 49, the range should be 1-48 next time
    int input;
    int from = 1;
    int to = 100;
    int round =1;
    Random random = new Random();

    do {
      // Keep asking user for the input
      Scanner scanner = new Scanner(System.in);
      System.out.println("Round:" + round + ": Please input a number between " + from + "-" + to);
      System.out.println("Please input a number beween " + from + "-" + to);
      // User can input an integer between a range of number (1-100)
      input = scanner.nextInt(); // bug, non-integer

      // Validation
      if (input < from || input > to) {
        System.out.println(("The input number is not within range " + from + "-" + to));
        System.out.println("Please input again.");
        System.out.println("");
        continue;
      }

      // if user != bomb, revise the range of number
      // if user input == bomb, end game
    } while (input != bomb); // condition to continue
    if (input > bomb) {
      to = input - 1;
    } else {
      from = input + 1;
    }
    round ++;
    while (input != bomb);

    System.out.println("Bomb!");
    // ...
  }
}
