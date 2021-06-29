import java.util.Scanner;
public class Electric_Bill
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter the units consumed: ");
        int unit = in.nextInt();
        double chrg;
        if (unit <= 200)
            chrg = 3.80*unit;
        else if (unit >=200 && unit<=300 )
            chrg = 4.40*unit;
        else if (unit>=300&&unit<=400 )
            chrg = 5.10*unit;
        else
            chrg = 5.80*unit;
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " +unit);
        System.out.println("Electric Bill:  Rs. "+chrg);
    }
}