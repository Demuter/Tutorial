package array;

public class MaxArray {
    public static void main(String[] args) {
        int[] list = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};

        int max = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }

        System.out.println("Max is " + max);
    }
}
