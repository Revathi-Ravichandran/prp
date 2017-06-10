import java.util.Scanner;
import java.util.Arrays;
class Commonsubarray
{
public static void main(String args[])
{
	Scanner S=new Scanner(System.in);
	int s1=S.nextInt();
	int s2=S.nextInt();
	int a[]=new int[s1];
	int b[]=new int[s2];
	for(int i=0;i<s1;i++)
		a[i]=S.nextInt();
	for(int i=0;i<s2;i++)
		b[i]=S.nextInt();
	int max=0,temp=0,pos=0,z=0;
	if(a.length<b.length)
		max=a.length;
	else
		max=b.length;
	int m[]=new int[max];
	int t[]=new int[max];
	max=0;
	for(int i=0;i<a.length;i++)
	{
		z=i;
		pos=0;
		temp=0;
		Arrays.fill(t,0);
		for(int j=0;j<b.length;j++)
		{
			if((z!=a.length)&&(a[z]==b[j]))
			{
				temp++;
				t[pos]=a[z];
				pos++;
				z++;
			}
			else if(((z==a.length)||(a[z]!=b[j]))&&temp>max)
			{
				max=temp;
				Arrays.fill(m,0);
				System.arraycopy(t,0,m,0,t.length);
				Arrays.fill(t,0);
				temp=0;
				pos=0;
				z=i;
			}
			else
				continue;
		}
		if(temp>max)
		{
		max=temp;
				Arrays.fill(m,0);
				System.arraycopy(t,0,m,0,t.length);
				Arrays.fill(t,0);
				temp=0;
				pos=0;
				z=i;
		}
	}
	for(int i=0;i<max;i++)
		System.out.println(m[i]);
}
}