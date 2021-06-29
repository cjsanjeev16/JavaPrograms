/** Write a java program to check whether a number is
a neon or not
* A number is a Neon number, if sum of the digits of
square of
* a number is equal to the number itself.
* Example: Number 9 is a Neon number, because 9 is
equal
* to sum of the digits of square of number (9x9 = 81 =
8+1 = 9).*/
import java.util.Scanner;
public class neon
{
public static void main()
{
int p,n,s,d;
s=0;
Scanner in = new Scanner(System.in);
System.out.println("Enter a number");
n = in.nextInt();
p=n*n; //n= 9 p = 9*9= 81 8+1 =9
do
{
d = p % 10; //d= 81%10 d = 8
s = s + d;//s=1+8 =9
p = p/10;
} while(p!=0);
if(s==n)
System.out.println("It is a Neon number");
else
System.out.println("It is not a Neon number");
}
}