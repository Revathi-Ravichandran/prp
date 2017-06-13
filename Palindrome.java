import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.next();
StringBuffer t=new StringBuffer(" ");
String s2=" ";
int f=0;
for(int i=0;i<s1.length();i++)
{
s2=" ";
s2=s1.substring(0,i)+s1.substring(i+1);
t=new StringBuffer(s2);
t.reverse();
if((t.toString()).equals(s2))
{
System.out.println("Character:"+s1.charAt(i)+" position:"+i);
f=1;
break;
}
}
if(f==0)
System.out.println("No possible palindromes");
}
}
