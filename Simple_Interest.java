//to find the Simple interest
import java.util.*;
  public class Simple_Interest
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principal,rate,and time");
        double P = in.nextDouble();
        double r = in.nextDouble();
        double t = in.nextDouble();
        double SI = P*r*t/100;
        System.out.println("Simple Interest"+SI);
    }
    
}        
        
        
        
        
        
        
       
        
        