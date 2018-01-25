package methods;

import java.util.Scanner;

public class NumbersCheck {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        NumbersCheck.CheckAM(n);
        NumbersCheck.CheckEasy(n);
        NumbersCheck.CheckDiv(n);

    }


    public static void CheckAM(int n) {
        if (n >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

    public static void CheckEasy(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("The number is not simple");
                return;
            }
        }
        System.out.println("The number is simple");
    }


    public static void CheckDiv(int n) {
        if ((n % 2 == 0) && (n % 5 == 0) && (n % 3 == 0) && (n % 6 == 0) && (n % 9 == 0)) {
            System.out.println("The number divide exactly");
        } else {
            System.out.println("The number does not divide exactly");
        }
    }
}
