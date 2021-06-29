import java.util.Scanner;
public class PayTaxi
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Taxi Number: ");
        String taxiNo = in.nextLine();
        System.out.print("Enter distance travelled: ");
        int dist = in.nextInt();
        int fare;
        if (dist <= 5)
            fare = 100;
        else if (dist <= 15)
            fare = 100 + (dist - 5) * 10;
        else if (dist <= 25)
            fare = 100 + 100 + (dist - 15) * 8;
        else
            fare = 100 + 100 + 80 + (dist - 25) * 5;
        System.out.println("Taxi No: " + taxiNo);
        System.out.println("Distance covered: " + dist+" Km");
        System.out.println("Amount: " + fare+" Rs");
    }
}