package logic;

public class LogicOperations {

    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        x += y >> x++ * z;
        System.out.println("x += y >> x++ * z\t\tAnswer  x = " + x);

        z = ++x & y * 5;
        System.out.println("z = ++x & y * 5\t\t\tAnswer  z = " + z);

        y /= x + 5 | z;
        System.out.println("y /= x + 5 | z\t\t\tAnswer  y = " + y);

        z = x++ & y * 5;
        System.out.println("z = x++ & y * 5z\t\tAnswer  z = " + z);

        x = y << x++ ^ z;
        System.out.println("x = y << x++ ^ z\t\tAnswer  x = " + x);

    }
}
