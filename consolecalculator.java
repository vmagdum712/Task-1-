import java.util.Scanner;

public class consolecalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println(" Division by zero is not allowed.");
            return Double.NaN; 
        }
        return a / b;
    }

    public static void Menu() {
        System.out.println("\n====== JAVA CONSOLE CALCULATOR ======");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Java Console Calculator!");

        while (running) {
            Menu();
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting... Thank you for using the calculator!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                    valid = false;
            }

            if (valid && !Double.isNaN(result)) {
                System.out.println("Result = " + result);
            }
        }

        sc.close();
    }
}
