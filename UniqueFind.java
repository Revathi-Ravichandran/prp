import java.util.Arrays;
import java.util.Scanner;
class UniqueFind
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=0;
		int a[]=new int[n];
       if(n%2==1)
	   {
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			}
			Arrays.sort(a);
		for(int i=0;i<n-1;i+=2)
			if(a[i]!=a[i+1])
			{
				System.out.println(a[i]);
				f=1;
			}
			if(f==0)
				System.out.println(a[n-1]);
	   }
	}
}
