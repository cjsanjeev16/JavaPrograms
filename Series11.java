/* WAP to print the sum of the series
* s= 1+1/3+ 1/5+1/7+1/9+........1/20
*/
// to find the sum of the series
public class Series11
{
public static void main()
{
int a=1,i;
double sum =0;
// s= 1+1/3+ 1/5+1/7+1/9+........1/20
for(i=1;i<=20;i=i+2)
{
sum =sum + a/i;
}
System.out.println("sum of the series"+sum);
}
}