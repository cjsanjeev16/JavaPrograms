public class Pattern2
{
    public static void main() 
    {
        int i,j;
        System.out.println ("The Triange pattern :");
        for (i = 9; i >= 1; i = i-2) 
        {
            for (j = 9; j >= i; j = j-2)
            {
            System.out.print(j + " ");
            System.out.println();
            }
        }
    }
}