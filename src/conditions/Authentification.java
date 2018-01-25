package conditions;

import java.util.Scanner;

public class Authentification {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "P@ssw0rd";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter login: ");

        String usersLogin = in.next();

        if (login.equals(usersLogin)) {
            System.out.print("Enter password: ");
            String usersPassword = in.next();

            if (password.equals(usersPassword)) {
                System.out.println("Hello " + usersLogin + ", You entered the correct password.");
            } else {
                System.out.println("You entered an incorrect password!");
            }
        } else {
            System.out.println("No user with that name!");
        }
    }
}
