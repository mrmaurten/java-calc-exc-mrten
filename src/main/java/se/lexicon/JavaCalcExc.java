package se.lexicon;

import java.util.Scanner;

public class JavaCalcExc {
    public static void main(String[] args) {
        System.out.println("This is the Java Calculator Exercise");
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        
        System.out.println("This is the calculator exercise.");

        while (running) {
            System.out.println("Please enter the number you wish to calculate:");
            double num1= sc.nextDouble();


            System.out.println("Now enter the symbol desired for calculation (+, -, *, /):");
            char operator = sc.next().charAt (0);

            System.out.println("Please now enter the second number you wish to calculate:");
            double num2 = sc.nextDouble();

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
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                running = false;
            }
        }

        System.out.println("Thank you for using the Calculator Application. Goodbye!");
        sc.close();
    }
}