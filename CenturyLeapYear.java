import java.util.Scanner;
public class CenturyLeapYear
   {
       public static void main()
       {
Scanner in = new Scanner(System.in);
System.out.print("Enter the year: ");
int yr = in.nextInt();
if (yr % 4 == 0 && yr % 100 != 0)
            System.out.println("It is a Leap Year");
else if (yr % 400 == 0)
            System.out.println("It is a Century Leap Year");
else if (yr % 100 == 0)
            System.out.println("It is a Century Year but not a Leap Year");
else
            System.out.println("It is neither a Century Year nor a Leap Year");
       }
    }