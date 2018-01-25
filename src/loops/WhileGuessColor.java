package loops;

import java.util.Scanner;

public class WhileGuessColor {
    public static void main(String[] args) {

        System.out.println("Guess the color from five attempts.");
        System.out.println("To exit the program, enter - exit.");

        final int MAX_ATTEMPT = 5;
        int attempt = 0;
        String color = "red";
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.print("Attempt " + attempt + ": ");
            String value = in.next();

            if (value.equals("exit")) {
                break;
            }

            if (!value.equals(color)) {
                continue;
            }

            System.out.println("Congratulations, you guessed with " + attempt + " try!");
            break;
        }

        System.out.println("Game over!");
    }
}
