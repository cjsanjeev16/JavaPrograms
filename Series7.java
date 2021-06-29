/**
* Write a java program to display the terms of the follwoing
* 0,3,8,5,15,24.....n terms
*/
import java.util.Scanner;
public class Series7
{
public static void main()
{
Scanner in = new Scanner(System.in);
int n,i,term =0;
System.out.println("Enter last digit");
n= in.nextInt();
for(i=3;i<=n;i=i+2)
{
term = term+i;
System.out.println(term +",");
}
}
}