// to find the side of a cube 
import java.util.*;
public class cube
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int v;
        double a; 
        System.out.println("Enter the volume of the cube");
        v = in.nextInt();
        a = Math.cbrt(v);
        System.out.println("Volume of the cube = "+v);
        System.out.println("Side of the cube = "+a);
    }
} 