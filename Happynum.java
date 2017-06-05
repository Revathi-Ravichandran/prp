import java.util.Scanner;
class Happynum
{
public static void main(String args[])
{
	Scanner S=new Scanner(System.in);
	int n=S.nextInt();
	int sum=0,k=0,f=0;
	while(n>0)
	{
		k=n%10;
		sum=sum+(k*k);
		n=n/10;
	}
	//System.out.println(sum);
	n=sum;
	while(sum!=1)
	{
		
		sum=0;
		while(n>0)
		{
			k=n%10;
			sum=sum+(k*k);
			n=n/10;
		}
		n=sum;
		//System.out.println(n);
		
	}
	if(sum==1)
		System.out.println("happy number");
}
}
		
