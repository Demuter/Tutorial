package methods;

import java.util.Scanner;

public class Arithmetics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int op1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int op2 = sc.nextInt();
        System.out.print("Sign: ");
        String sym = sc.next();

        switch (sym) {
            case "+":
                add(op1, op2);
                break;
            case "-":
                sub(op1, op2);
                break;
            case "*":
                mul(op1, op2);
                break;
            case "/":
                div(op1, op2);
                break;
            default:
                System.out.println("Unknown!");
        }
    }

    public static void add(int op1, int op2) {
        System.out.println(op1 + " + " + op2 + " = " + (op1 + op2));
    }

    public static void sub(int op1, int op2) {
        System.out.println(op1 + " - " + op2 + " = " + (op1 - op2));
    }

    public static void mul(int op1, int op2) {
        System.out.println(op1 + " * " + op2 + " = " + (op1 * op2));
    }

    public static void div(int op1, int op2) {
        if (op2 == 0) {
            System.out.println("To divide by zero is forbidden");
            return;
        }
        System.out.println(op1 + " / " + op2 + " = " + (op1 / op2));
    }
}
