package types;

public class BasicTypes {
    public static void main(String[] args) {

        byte a = -128;
        byte b = +127;

        short c = -32768;
        short d = +32767;

        int e = -2147483648;
        int f = +2147483647;

        long g = -9223372036854775808L;
        long h = +9223372036854775807L;

        float i = -0.123456789f;
        float j = +1.123456789F;

        double k = -0.123456789d;
        double l = +1.123456789;

        boolean m = true;
        boolean n = false;

        char o = 'a';
        char p = 'A';

        String firstString = "hello";
        String secondString = "HELLO";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(firstString);
        System.out.println(secondString);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
