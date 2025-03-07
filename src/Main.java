import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double total;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        total = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d year(s) is $%.2f.", years, total);

        scanner.close();
    }
}