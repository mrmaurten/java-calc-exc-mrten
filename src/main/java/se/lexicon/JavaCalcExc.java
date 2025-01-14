package se.lexicon;

import java.util.Scanner;

public class JavaCalcExc {
    public static void main(String[] args) {
        System.out.println("This is the Java Calculator Exercise");
        Scanner scanner = new Scanner(System.in);
        Runner running = new Runner(System.in);

        
        System.out.println("This is the calculator exercise.");

        while (running) {
            System.out.println("Please enter the number you wish to calculate:");
            double num1= Scanner.nextDouble();
            boolean running = true;

            System.out.println("Now enter the symbol desired for calculation (+, -, *, /):");
            char operator = Scanner.next().charAt (0);

            System.out.println("Please now enter the second number you wish to calculate:");
            double num2 = Scanner.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    continue;
            }

            System.out.println("The result is: " + result);

            System.out.println("Would you like to perform another calculation? (yes/no):");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                running = false;
            }
        }

        System.out.println("Thank you for using the Calculator Application. Goodbye!");
        scanner.close();
    }
}