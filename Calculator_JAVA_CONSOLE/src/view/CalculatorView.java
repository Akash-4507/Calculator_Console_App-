package view;

import controller.CalculatorController;
import service.CalculatorService;

import java.util.Scanner;

public class CalculatorView {
    public static Scanner scanner = new Scanner(System.in);
    public int getChoice() {
        System.out.println("Enter choice: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        return Integer.parseInt(scanner.nextLine());
    }

    public void getExit() {
        System.out.println("Thanks for using Calculator ");
    }

    public double getNumber(String number) {
        System.out.println("Enter the  "+number);
        return Double.parseDouble(scanner.nextLine());
    }

    public void showResult(double result) {
        System.out.println("The result is: " + result);

    }

    public void getError(String s) {
        System.out.println(s);
    }
}
