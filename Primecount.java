import java.util.Scanner;
class Primecount
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		int r1=s.nextInt();
		int r2=s.nextInt();
		int count=0,f=0;
		for(int i=r1;i<=r2;i++)
		{
			f=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
				else
					f=0;
			}
			if(f==0)
				count++;
		}
		System.out.println(count);
	}
}	
