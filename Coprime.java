import java.util.Scanner;
class Coprime
{
public static void  main(String args[])
{
Scanner S=new Scanner(System.in);
int n1=S.nextInt();
int n2=S.nextInt();
int min;
int f=0;
if(n1<n2)
min=n1;
else
min=n2;
for(int i=2;i<=min;i++)
{
if(n1%i==0&&n2%i==0)
{
f=1;
break;
}
}
if(f==1)
System.out.println("Not a CoPrime");
else
System.out.println("CoPrime");
}
}