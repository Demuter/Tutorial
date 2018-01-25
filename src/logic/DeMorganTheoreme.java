package logic;

public class DeMorganTheoreme {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Condition before application of De Morgan's theorem.
        if (!a || !b)
            System.out.println("!A || !B = " + (!a || !b));
        else
            System.out.println("!A || !B = " + (!a || !b));

        // Condition after application of De Morgan's theorem.
        if (!(a && b))
            System.out.println("!(A && B) = " + !(a && b));
        else
            System.out.println("!(A && B) = " + !(a && b));
    }
}
