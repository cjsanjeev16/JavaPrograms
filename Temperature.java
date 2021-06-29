import java.util.Scanner;

public class Temperature
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("Enter your choice (1 or 2) :");
        int choice = in.nextInt();
        double F = 0.0, C = 0.0;

        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Fahrenheit: ");
                F = in.nextDouble();
                C = 5 / 9.0 * (F - 32);
                System.out.println("Temperature in Celsius: " + C);
                break;

            case 2:
                System.out.println("Enter temperature in Celsius: ");
                C = in.nextDouble();
                F = 1.8 * C + 32;
                System.out.println("Temperature in Fahrenheit: " + F);
                break;

            default:
                System.out.println("Incorrect Choice");
                break;
        }
    }
}