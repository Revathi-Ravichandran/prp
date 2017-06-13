import java.util.Scanner;
class Doublestr
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
String s=S.next();
int f=0;
String s1=" ",s2=" ",s3=" ";
if(s.length()%2==1)
{
for(int i=0;i<s.length();i++)
{
s1=" ";
s2=" ";
s3=" ";
s1=s.substring(0,i)+s.substring(i+1);
s2=s1.substring(0,s1.length()/2);
s3=s1.substring(s1.length()/2,s1.length());
//System.out.println(s1+" "+s2+" "+s3);
if(s2.equals(s3))
{
f=1;
break;
}
}
if(f==1)
System.out.println("DoubleString="+s1);
else
System.out.println("Not a Double String");
}
else
System.out.println("Not a DoubleString");
}
}

