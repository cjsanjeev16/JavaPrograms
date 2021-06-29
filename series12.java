import java.util.*;
public class series12
{
    public static void main()
    {
    int a,n;
    double sum =0;
    //* s= 1/2-2/3+3/4-4/5 +........n
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of n");
    n= in.nextInt();
    

   
    for (int i = 1; i <= n; i++) { 
   
        // Generate the ith term and 
        // add it to the sum if i is 
        // even and subtract if i is 
        // odd 
        if (i % 2 == 1) { 
            sum += (double)i / (i + 1); 
        } 
        else { 
            sum -= (double)i / (i + 1); 
        } 
    } 
   
    // Print the sum 
 
    System.out.println("sum of the series"+sum);
    }
    
}