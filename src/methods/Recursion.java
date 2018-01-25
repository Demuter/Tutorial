package methods;

public class Recursion {

    static int calculate(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return calculate(b, a % b);
    }

    static int calculate2(int a, int b) {
        while (b != 0)
            b = a % (a = b);
        return a;
    }

    public static void main(String[] args) {

        System.out.println("Finding the greatest common divisor of two integers.");

        int a = 676, b = 3676;

        System.out.println("a = " + a + ", b = " + b + ", GCD = " + calculate(a, b) + ";");
        System.out.println("a = " + a + ", b = " + b + ", GCD = " + calculate2(a, b) + ";");
    }
}
