package conditions;

import java.util.Scanner;

public class SwitchCoffeeMachine {
    public static void main(String[] args) {

        System.out.println("The size of a cup of coffee are: 1 = Small, 2 = Medium, 3 = Grand");
        System.out.print("Please make your choice: ");

        Scanner in = new Scanner(System.in);
        String coffeeSize = in.next();

        int cost = 0;

        switch (coffeeSize) {
            case "3":
                cost += 50;
            case "2":
                cost += 25;
            case "1":
                cost += 25;
                break;
            default:
                System.out.println("Wrong choice. Please choose 1, 2, or 3.");
                break;
        }

        if (cost != 0) {
            System.out.println("Add " + cost + " cents.");
            System.out.println("Thank you!");
        } else {
            System.out.print("Please repeat the selection.");
        }
    }
}
