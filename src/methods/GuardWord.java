package methods;

import java.util.Scanner;

public class GuardWord {

    static String function(String name) {

        if (name.equals("fool")) {  // Guard
            return "You used an invalid word.";
        }

        String sentence = "Hello " + name + "!";

        return sentence;
    }

    public static void main(String[] args) {

        System.out.print("Enter you name: ");

        Scanner in = new Scanner(System.in);
        String name = in.next();

        String sentence = function(name);

        System.out.println(sentence);
    }
}
