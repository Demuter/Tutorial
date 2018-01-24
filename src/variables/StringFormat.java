package variables;

public class StringFormat {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        System.out.println("This number is " + a);

        System.out.println(String.format("This number is %1$s", a));

        System.out.printf("This number is %1$s \n", a);
        System.out.printf("This number is %1$s и %2$s \n", b, c);
        System.out.printf("These numbers are the reverse %2$s and %1$s", b, c);

        System.out.printf("\n%1$+022.10f", Math.PI);
    }
}
