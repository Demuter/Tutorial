package variables;

public class Casting {
    public static void main(String[] args) {


        byte a = 10;    //                                      0000 1010  -  1 byte
        int b = 0;      //  0000 0000   0000 0000   0000 0000   0000 0000  -  4 byte
        b = a;          //  0000 0000   0000 0000   0000 0000   0000 1010  -  4 byte

        System.out.println("b = " + b);

        int c = 255;
        float d = 0f;
        d = c;

        System.out.println("d = " + d);


        int e = 128;    //  0000 0000   0000 0000   0000 0000   1000 0000  -  4 byte
        byte f = 0;     //                                      0000 0000  -  1 byte
        f = (byte)e;    //                                      0000 0001  -  1 byte
        // f = e;       //  Error
        System.out.println("f = " + f);


        float g = 10.5F;
        int h = 0;
        h = (int)g;
        // h = g;       // Error

        System.out.println("h = " + h);



        final int i = 127;
        byte j = 0;
        j = i;

        System.out.println("j = " + j);



        final float k = 255;
        byte l = 0;
        l = (byte)k;

        System.out.println("l = " + l);



        final int m = 254;  //  0000 0000   0000 0000   0000 0000   1111 1110  -  4 byte
        byte n = 0;         //                                      0000 0000  -  1 byte
        n = (byte)m;        //                                      0000 0001  -  1 byte
        // n = m;           //  Error

        System.out.println("n = " + n);



        final float o = 128.5f;
        byte p = 0;
        p = (byte)o;
        // p = o;           //  Error

        System.out.println("p = " + p);
    }
}
