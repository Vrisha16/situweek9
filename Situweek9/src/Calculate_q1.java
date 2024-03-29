import java.util.Scanner;

/*Write a java program using the following descriptions
        1. Create one package with name calculate
        2. Create two class with name “Calculator” and “Main”
        3. Create four methods with manes “addition”, “subtraction”, “division”,
        and “multiplication”. All methods are instance method and it doesn’t
        return anything. But it has two parameters with name “int a” and “int
        b”. Also each method have System.out.println(). This prints the result.
        Also create all one more method with name “calculateResult” with
        three parameter with name int a, int b and char symbol. Write the logic
        in calculateResult method that when user enter first number and
        second number and symbol based on symbol it does calculate.
        4. Write a “main” method into main class. It has scanner that takes user
        input. Also write the logic that it ask user to “Enter first Number:”,
        “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
        enter + symbol result like “Addition of 5 and 10 is: 15” and respective
        for other symbol.
        5. With the result it’s also print one more message “Would you like to do
        more calculation Please enter “Y” or “N” :” (Hint use while loop if user
        enter Y program asking the user to enter First Number, and if user enter
        N program should terminate)*/
        public class Calculate_q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean Calculations = true;

        while (Calculations) {
            // Input first number
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            // Input second number
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            // Input arithmetic operator symbol
            System.out.print("Please enter one of the symbols (+, -, *, /): ");
            char operator = input.next().charAt(0);

            double result = 0;

            // Perform arithmetic operation  operator symbol
            if (operator == '+') {
                result = num1 + num2;
                System.out.println("Addition of " + num1 + " and " + num2 + " is: " + result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println("Subtraction of " + num2 + " from " + num1 + " is: " + result);
            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division of " + num1 + " by " + num2 + " is: " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
            } else {
                System.out.println("Invalid operator symbol!");
            }

            System.out.print("Would you like to do more calculations? Please enter 'Y' or 'N': ");//perform calculation.
            char choice = input.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                Calculations = false;
            }
        }
    }
}




