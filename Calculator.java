import java.util.Scanner;

public class Calculator
{
    public static void main()
    {
        char op;
        double number1, number2, result;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter operator (either +, -, * or /): ");
        // ask user to enter operator
        op = in.next().charAt(0);
        System.out.println("Enter number1 and number2 respectively: ");
        // ask user to enter numbers
        number1 = in.nextDouble();
        number2 = in.nextDouble();
        switch (op)
        {
        case '+':
        result = number1 + number2;
        System.out.print(number1 + "+" + number2 + " = " + result);
        break;
        case '-':
        result = number1 - number2;
        System.out.print(number1 + "-" + number2 + " = " + result);
        break;
        case '*':
        result = number1 * number2;
        System.out.print(number1 + "*" + number2 + " = " + result);
        break;
        case '/':
        result = number1 / number2;
        System.out.print(number1 + "/" + number2 + " = " + result);
        break;
        default:
        System.out.println("Invalid operator!");
        }
    }
}