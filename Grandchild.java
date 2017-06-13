import java.util.Scanner;
class Grandchild
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int count=0;
String s1[][]=new String[n][2];
for(int i=0;i<n;i++)
for(int j=0;j<2;j++)
s1[i][j]=S.next();
String s2=S.next();
String s3=" ";
for(int i=0;i<n;i++)
if(s1[i][1].equals(s2))
{
s3=s1[i][0];
break;
}
for(int i=0;i<n;i++)
if(s1[i][1].equals(s3))
count++;
System.out.println(count);
}
}
