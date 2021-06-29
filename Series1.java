/** Write a java program to display the
terms of the follwoing
* 1,4,9,16......n terms
*/
import java.util.Scanner;
public class Series1
{
public static void main()
{
Scanner in = new Scanner(System.in);
int n,i;
System.out.println("Enter last digit");
n = in.nextInt();
for(i=1;i<=n;i++)
{
System.out.print(i*i+",");
}
}
}