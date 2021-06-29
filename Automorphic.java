import java.util.Scanner;
// to check number is armstrong or not
public class Automorphic
{
public static void main()
{
long p,f=0,num;
Scanner in = new Scanner(System.in);
System.out.println("Enter a number");
num = in.nextLong();
p=num*num;
do
{
if(num%10 != p%10)
{
f=1;
break;
}
else
{
num = num/10;
p=p/10;
}
}
while(num>0);
if(f==0)
System.out.println("It is a Automorphic number");
else
System.out.println("It is not a Automorphic number");
}
}