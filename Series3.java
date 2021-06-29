/**
* Write a java program to display the
terms of the follwoing
* 1,4,16,64.....n terms
*/
import java.util.Scanner;
public class Series3
{
public static void main()
{
//* 1,4,16,64.....n terms
Scanner in = new Scanner(System.in);
int n,i;
System.out.println("Enter last digit");
n= in.nextInt();
for(i=0;i<=n;i=i+2)
{
System.out.println(Math.pow(2,i));
}
}
}