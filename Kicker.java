import java.util.Scanner;
class Kicker
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=S.nextInt();
int sum=0;
for(int i=0;i<n;i++)
{
sum=1;
for(int j=1;sum<a[i];j++)
{
sum=sum+sum;
if(sum>a[i])
{
break;
}
}
if(sum==a[i])
System.out.println("True");
else
System.out.println("False");
}
}
}