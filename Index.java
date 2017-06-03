import java.util.Arrays;
import java.util.Scanner;
class Index
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
	
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
				if(a[i]==i)
				{
					System.out.println(a[i]);
				}
			}
			
	}
}
