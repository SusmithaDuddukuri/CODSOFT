import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fixed exchange rates (approx values used in your output)
        double usdToInr = 91.03;
        double usdToEur = 0.85;

        double inrToUsd = 0.011;
        double inrToEur = 0.0095;

        double eurToUsd = 1.17;
        double eurToInr = 107.5;

        while (true) {

            System.out.print("Enter Base Currency (USD, INR, EUR): ");
            String base = sc.nextLine().toUpperCase();

            System.out.print("Enter Target Currency (USD, INR, EUR): ");
            String target = sc.nextLine().toUpperCase();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine(); // consume newline

            double result = 0;

            if (base.equals("USD") && target.equals("INR")) {
                result = amount * usdToInr;
            } else if (base.equals("USD") && target.equals("EUR")) {
                result = amount * usdToEur;
            } else if (base.equals("INR") && target.equals("USD")) {
                result = amount * inrToUsd;
            } else if (base.equals("INR") && target.equals("EUR")) {
                result = amount * inrToEur;
            } else if (base.equals("EUR") && target.equals("USD")) {
                result = amount * eurToUsd;
            } else if (base.equals("EUR") && target.equals("INR")) {
                result = amount * eurToInr;
            } else {
                System.out.println("Invalid conversion!");
                continue;
            }

            System.out.printf("Converted Amount: %.2f %s%n", result, target);

            System.out.print("\nDo you want another conversion? (yes/no): ");
            String choice = sc.nextLine().toLowerCase();

            if (!choice.equals("yes")) {
                break;
            }

            System.out.println();
        }

        sc.close();
        System.out.println("Thank you for using Currency Converter!");
    }
}