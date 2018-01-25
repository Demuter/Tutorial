package conditions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Enter the sign of the arithmetic operation: ");

        Scanner sc = new Scanner(System.in);
        String sign = sc.nextLine();

        int operand1 = 10;
        int operand2 = 5;
        int result = 0;

        switch(sign)
        {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if(operand2 == 0)
                {
                    System.out.println("To divide by zero is forbidden");
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Unknown sign");
                return;
        }

        System.out.println(operand1 + " " + sign + " " + operand2 + " = " + result);
    }
}
