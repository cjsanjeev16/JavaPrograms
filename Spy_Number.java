import java.util.*;
public class Spy_Number
{
public static void main(String args[])
{
int n, pro, sum, digit;
pro = 1;
sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to check if it is a spy number or not:");
n = sc.nextInt();
while(n != 0)
{
digit = n % 10;//123%10=3
pro = pro * digit;//1*3=3
sum = sum + digit;
n = n / 10;//n=123/10=12
break;
}
if(sum == pro)
System.out.println("It is a Spy Number");
else
System.out.println("It is not a Spy Number");
}
}