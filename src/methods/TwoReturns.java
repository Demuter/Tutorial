package methods;

import java.util.Scanner;

public class TwoReturns {

    static String compare(int value1, int value2) {
        if (value1 < value2) {
            return "Comparison Less Than";
        } else if (value1 > value2) {
            return "Comparison Greater Than";
        }
        return "Comparison Equal";
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers.");
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        int operand1 = in1.nextInt();
        int operand2 = in2.nextInt();

        String result = compare(operand1, operand2);
        System.out.println(result);
    }
}
