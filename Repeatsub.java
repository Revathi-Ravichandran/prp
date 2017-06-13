import java.util.Scanner;
class Repeatsub
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
String s1=S.next();
String t=s1.charAt(0)+" ";
String t1=t.trim();
String temp=" ";
char t2=' ';
int len=0,temp1=0,f=0;
for(int i=1;i<s1.length();i++)
{
f=0;
t2=s1.charAt(i);
for(int j=0;j<t1.length();j++)
{
if(t2==t1.charAt(j))
{
f=1;
break;
}
}
if(f==0)
{
t1=t1+t2;
temp1++;
}
else
{
if(temp1>len)
{
len=temp1;
temp=t1;
}
temp1=0;
t1=" ";
}
}
System.out.println(len+" "+temp);
}
}
