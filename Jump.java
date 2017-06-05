import java.util.Scanner;
class Jump
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int sum=0,t=0,f=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)	
a[i]=S.nextInt();
while(sum<n-1)
{
	if(sum>=n-1||a[t]==0)
	break;
else{
sum=sum+a[t];
t=sum;
}
}
if(sum==n-1)
System.out.println("true");
else
System.out.println("false");
	}
}	
