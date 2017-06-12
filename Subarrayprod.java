import java.util.Arrays;
import java.util.Scanner;
class Subarrayprod
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=S.nextInt();
int max=a[0]*a[1],prd=1,pos=0,pos1=0;
int temp[]=new int[n];
int max1[]=new int[n];
for(int i=0;i<n-1;i++)
{
for(int j=i;j<n;j++)
{
	for(int k=i;k<=j;k++)
{
temp[pos]=a[k];
prd=prd*a[k];
pos++;
}
//System.out.println(prd);
if(prd>max)
{
max=prd;
pos1=pos;
Arrays.fill(max1,0);
System.arraycopy(temp,0,max1,0,temp.length);
}
prd=1;
pos=0;
Arrays.fill(temp,0);
}
}
for(int i=0;i<pos1;i++)
System.out.println(max1[i]);
}
}