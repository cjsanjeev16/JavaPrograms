import java.util.Scanner;
public class CourseSelection
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter marks in Maths : ");
        int a = in.nextInt();
        System.out.print("Enter marks in Physics : ");
        int b = in.nextInt();
        System.out.print("Enter marks in Biology : ");
        int c = in.nextInt();
        String CS ="";
        double avg = (a+b+c)/3;
        if (avg > 80)
            CS = "Computer Science";
        else if (avg < 80 && avg > 60 )
           CS = "Bio-Science";
        else if (avg > 40 && avg < 60 )
            CS = "Commerce";

        System.out.println("Name: " + name);
        System.out.println("Percentage in previous class: " +avg);
        System.out.println("Course offered : "+CS);
    }
}