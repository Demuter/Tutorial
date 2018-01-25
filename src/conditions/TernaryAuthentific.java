package conditions;

import java.util.Scanner;

public class TernaryAuthentific {
    public static void main(String[] args) {
        String string = "Hello";

        System.out.print("Enter login: ");
        Scanner in = new Scanner(System.in);

        String login = in.next();

        string += login.equals("Admin") ? "Administrator" : "User";
        System.out.print(string);
    }
}
