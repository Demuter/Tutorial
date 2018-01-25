package methods;

public class Bank {
    public static void main(String[] args) {
        payment(100);
        payment(2000);
    }

    public static void payment(double money) {
        double credit = 8000;
        double debts = 0;
        double overPayment = 0;

        if (money > credit) {
            overPayment = money - credit;
            System.out.println("Overpayment amounted to " + overPayment + " \u20BD");
            System.out.println("Loan repaid");
        } else if (money == credit) {
            System.out.println("Loan repaid");
        } else {
            debts = credit - money;
            System.out.println("The debt is " + debts + " \u20BD");
        }
    }
}
