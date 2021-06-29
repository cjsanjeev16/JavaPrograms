import java.util.Scanner;
// to check number is armstrong or not
public class Armstrong
{
public static void main()
{
int a,s,num;
s=0;
Scanner in = new Scanner(System.in);
System.out.println("Enter a number");
int n = in.nextInt();
num=n; //n= 153
while(n>0)
{
a = n % 10;// a = 3
s = s + a*a*a; //s = 27+ 125+1 = 153
n = n/10; // n = 1
}
if(num==s)
System.out.println("It is an Armstrong number");
else
System.out.println("It is not an Armstrong number");
}
}