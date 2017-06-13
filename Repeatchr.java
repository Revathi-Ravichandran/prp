import java.util.Scanner;
class Repeatchr
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
String s1=S.next();
char t=' ';
int n=0;
for(int i=0;i<s1.length();i+=2)
{
t=s1.charAt(i);
n=Character.getNumericValue(s1.charAt(i+1));
for(int j=0;j<n;j++)
System.out.print(t);
}
}
}
