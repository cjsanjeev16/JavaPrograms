/**
* Write a program to print the sum of the series
* s = 2 - 4 + 6 - 8 + 10......n
*/
import java.util.Scanner;
public class diagonal
{
public static void main()
{
Scanner in = new Scanner(System.in);
int a;
double d;
System.out.println("Enter side of a square");
a= in.nextInt();
d=Math.sqrt(2)*a;
System.out.println("Side of sq="+a);
System.out.println("Diagonal of sq="+d);
}
}