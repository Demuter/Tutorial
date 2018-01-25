package loops;

import java.util.Scanner;

public class DoWhileFactorial {

    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int counter = in.nextInt();
        int factorial = 1;

        System.out.print("The factorial: " + counter + "! = ");

        do {
            factorial *= counter--;
        }
        while (counter > 0);

        System.out.println(factorial);

        if (factorial == 0)
            System.out.println("You entered a large number. Please try again.");
    }
}
