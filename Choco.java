import java.util.Scanner;
class Choco
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int a[][]=new int[n][2];
for(int i=0;i<n;i++)
for(int j=0;j<2;j++)
a[i][j]=S.nextInt();
for(int i=0;i<n;i++)
System.out.println(a[i][0]*a[i][1]-1);
}
}
