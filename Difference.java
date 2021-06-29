// Write a program to find the Difference of two numbers
import java.util.Scanner;
public class Difference
{
    public static void main()
    {
        int N1,N2,tot=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter First number");
         N1  = in.nextInt();
        System.out.println("Enter Second number");
         N2  = in.nextInt();
         tot = N1-N2;
        System.out.println("Difference of two numbers = "+tot);
    
    }
}
    