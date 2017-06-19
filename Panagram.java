import java.util.Scanner;
class Panagram
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
String s1=S.next();
int f=0;
int a[]=new int[26];
for(int i=0;i<s1.length();i++)
{
if(Character.isUpperCase(s1.charAt(i)))
a[(int)s1.charAt(i)-65]++;
if(Character.isLowerCase(s1.charAt(i)))
a[(int)s1.charAt(i)-97]++;
}
for(int i=0;i<26;i++)
if(a[i]==0)
{
f=1;
break;
}
if(f==1)
System.out.println("Not a Panagram");
else
System.out.println("Panagram");
}
}


