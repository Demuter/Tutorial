package conditions;

public class TernaryQuadrant {
    public static void main(String[] args) {

        int x = 10, y = 5;

        String quadrant0, quadrant1,quadrant2;

        //                   condition    true block    false block     condition   true block       false block
        //                    -------- ? ------------ : -------------    -------- ? ------------- : --------------
        quadrant0 = (x > 0) ? ((y > 0) ? "I quadrant" : "IV quadrant") : ((y > 0) ? "II quadrant" : "III quadrant");
        //          ------- ? ---------------------------------------- : -------------------------------------------
        //         condition               true block                                   false block

        // ... or

        quadrant1 = x > 0 ? (y > 0 ? "I quadrant" : "IV quadrant") : (y > 0 ? "II quadrant" : "III quadrant");

        // ... or

        quadrant2 = x > 0 ? y > 0 ? "I quadrant" : "IV quadrant" : y > 0 ? "II quadrant" : "III quadrant";

        System.out.println(quadrant0);
        System.out.println(quadrant1);
        System.out.println(quadrant2);
    }
}
