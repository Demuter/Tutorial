package logic;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {

        System.out.println("Enter how many workers worked for the company and his wages.");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        double money = sc.nextDouble();

        if (year >= 0 && year <= 4) {
            money = money * 1.10 - money;
            System.out.println("Employee bonus with long service " + year + " will be 10% of wages - " + money + "$");
        } else if (year >= 5 && year <= 9) {
            money = money * 1.15 - money;
            System.out.println("Employee bonus with long service " + year + " will be 15% of wages - " + money + "$");
        } else if (year >= 10 && year <= 14) {
            money = money * 1.25 - money;
            System.out.println("Employee bonus with long service " + year + " will be 25% of wages - " + money + "$");
        } else if (year >= 15 && year <= 19) {
            money = money * 1.35 - money;
            System.out.println("Employee bonus with long service " + year + " will be 35% of wages - " + money + "$");
        } else if (year >= 20 && year <= 24) {
            money = money * 1.45 - money;
            System.out.println("Employee bonus with long service " + year + " will be 45% of wages - " + money + "$");
        } else if (year >= 25) {
            money = money * 1.50 - money;
            System.out.println("Employee bonus with long service " + year + " will be 50% of wages - " + money + "$");
        }
    }
}
