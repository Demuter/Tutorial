package methods;

import java.util.Scanner;

public class Conversion {
    public static final double BYR_to_USD = 1.9750;
    public static final double BYR_to_EUR = 2.4450;
    public static final double USD_to_BYR = 1.9770;
    public static final double USD_to_EUR = 0.8055;
    public static final double EUR_to_BYR = 2.4500;
    public static final double EUR_to_USD = 1.2400;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите валюту, которую хотите поменять, рубли/ доллары/ евро" + "\n" + "r / d / e");
        String currency = sc.next();
        System.out.println("Во что вы хотите конвертировать? рубли/ доллары/ евро" + "\n" + "r / d / e");
        String convCurrency = sc.next();
        System.out.println("Введите сумму:");
        double money = sc.nextDouble();

        if (money < 0) {
            System.out.println("Отрицательные числа вводить нельзя");
            return;
        }

        if (currency.equals("r") && convCurrency.equals("d")) {
            System.out.println("Конвертация рубля в доллары : " + convByroUSD(money) + "$");
        } else if (currency.equals("r") && convCurrency.equals("e")) {
            System.out.println("Конвертация рубля в евро : " + convByrToEUR(money) + "€");
        } else if (currency.equals("d") && convCurrency.equals("r")) {
            System.out.println("Конвертация доллары в рубли : " + convUSDtoByr(money) + "\u20BD");
        } else if (currency.equals("d") && convCurrency.equals("e")) {
            System.out.println("Конвертация доллары в евро : " + convUSDtoEUR(money) + "€");
        } else if (currency.equals("e") && convCurrency.equals("r")) {
            System.out.println("Конвертация евро в рубли : " + convEURtoByr(money) + "\u20BD");
        } else if (currency.equals("e") && convCurrency.equals("d")) {
            System.out.println("Конвертация евро в доллары : " + convEURtoUSD(money) + "€");
        } else {
            System.out.println("К сожалению, такой валюты нет.");
        }
    }

    public static double convByroUSD(double money) {
        return money * BYR_to_USD;
    }

    public static double convByrToEUR(double money) {
        return money * BYR_to_EUR;
    }

    public static double convUSDtoByr(double money) {
        return money * USD_to_BYR;
    }

    public static double convUSDtoEUR(double money) {
        return money * USD_to_EUR;
    }

    public static double convEURtoByr(double money) {
        return money * EUR_to_BYR;
    }

    public static double convEURtoUSD(double money) {
        return money * EUR_to_USD;
    }
}
