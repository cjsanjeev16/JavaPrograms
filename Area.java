
/**
 * Write a description of class Area here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Area
{
    // instance variables - replace the example below with your own
    int x;

    /**
     * Constructor for objects of class Area
     */

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main()
    {
        // put your code here
        Scanner sc = new Scanner(System.in);
        double b=sc.nextInt();
        double h=sc.nextInt();
        double area =(b*h)/2;
        System.out.println("Area of triange = "+area);
    }
}
