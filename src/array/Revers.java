package array;

public class Revers {
    public static void main(String[] args) {

        int[] a = {5, 3, 33, 7, 0, -12, -17, 28, 159, 11};

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
