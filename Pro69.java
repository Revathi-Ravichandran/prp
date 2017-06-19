import java.util.Scanner;
import java.util.Arrays;
class Pro69
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
String s1=S.next();
int pos=-1,sum=0,sum1=0,temp=0,count=0;
for(int i=0;i<s1.length();i++)
{
if(Character.isDigit(s1.charAt(i)))
count++;
}
int a[]=new int[count];
for(int i=0;i<s1.length();i++)
{
if(Character.isDigit(s1.charAt(i)))
a[++pos]=Character.getNumericValue(s1.charAt(i));
}
Arrays.sort(a);
for(int i=0;i<=pos;i++)
{
sum=sum+(a[i]*a[pos]);
sum1=sum1+(a[i]*a[0]);
}
temp=sum;
sum=0;
ser:
while(temp>0)
{
sum=sum+temp%10;
temp=temp/10;
if(sum>10&&temp==0)
{
temp=sum;
sum=0;
continue ser;
}
}
temp=sum1;
sum1=0;
ser1:
while(temp>0)
{
sum1=sum1+temp%10;
temp=temp/10;
if(sum1>10&&temp==0)
{
temp=sum1;
sum1=0;
continue ser1;
}
}
if(sum<sum1)
System.out.println(sum*sum);
else
System.out.println(sum1*sum1);
}
}

