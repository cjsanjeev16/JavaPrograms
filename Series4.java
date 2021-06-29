/** Write a java program to display the
terms of the follwoing
* 24,99,224..n terms
*/
import java.util.Scanner;
public class Series4
{
public static void main()
{
//* 24,99,224,399..n terms
Scanner in = new Scanner(System.in);
int n,i;
System.out.println("Enter last digit");
n= in.nextInt();
for(i=5;i<=n;i=i+5)
{
System.out.println((i*i)-1);
}
}
}