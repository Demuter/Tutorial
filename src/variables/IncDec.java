package variables;

public class IncDec {
    public static void main(String[] args) {
        System.out.println("----- Post-increment");

        byte number1 = 0;
        System.out.println(number1++);
        System.out.println(number1);

        System.out.println("----- Pre-increment");

        byte number2 = 0;
        System.out.println(++number2);

        System.out.println("----- Post-decrement");

        byte number3 = 0;
        System.out.println(number3--);
        System.out.println(number3);

        System.out.println("----- Pre-decrement");

        byte number4 = 0;
        System.out.println(--number4);
        int i = 0;

        i = i + 1;  i += 1;
        i = i + 5;  i += 5;

        i = i - 10;  i -= 10;
    }
}
