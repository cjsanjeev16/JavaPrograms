/**
* Write a java program to display the
terms of the follwoing
* 3,6,9,12......n terms
*/
import java.util.Scanner;
public class Series2
{
public static void main()
{
Scanner in = new Scanner(System.in);
int n,i;
System.out.println("Enter last digit");
n= in.nextInt();
for(i=3;i<=n;i=i+3)
{
System.out.print(i+",");
}
}
}