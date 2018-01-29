package array;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        process(num);
    }

    public static void process(int num) {

        int arr[] = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) - 5);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);

        int arg = 0;
        for (int i = 0; i < arr.length; i++) {
            arg += arr[i];
        }
        arg /= arr.length;
        System.out.println("Average: " + arg);

        System.out.print("Odd elements: ");

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
