import java.util.Scanner;
public class Profit_Loss
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter cost price of the article: ");
        double cp = in.nextDouble();
        System.out.print("Enter selling price of the article: ");
        double sp = in.nextDouble();
        double p = sp - cp;
        double percent = Math.abs(p) / cp * 100;
if (p > 0)
{
         System.out.println("Profit = " + p);
         System.out.println("Profit % = " + percent);
}
else if (p < 0)
{
         System.out.println("Loss = " + Math.abs(p));
         System.out.println("Loss % = " + percent);
}
    else
System.out.println("Neither profit nor loss");
}
}
