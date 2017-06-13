import java.util.Scanner;
class Numpalin
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int sum=0;
while(n>0)
{
sum=sum+n%10;
n=n/10;
}
String t=sum+" ";
StringBuffer sb=new StringBuffer(t.trim());
sb.reverse();
if((sb.toString()).equals(t.trim()))
System.out.println(t+" is a palindrome");
else
System.out.println("Not a Palindrome");
}
}
