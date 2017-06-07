import java.util.Scanner;
import java.util.Arrays;
class Greedy
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int total=s.nextInt();
	int num=s.nextInt();
	int coin[]=new int[num];
	for(int i=0;i<num;i++)
		coin[i]=s.nextInt();
	Arrays.sort(coin);
	int rem=total;
	int pos=num-1,count=0;
	while(rem!=0)
	{
		count=count+(rem/coin[pos]);
		
		rem=rem%coin[pos];
		pos--;
	}
	System.out.println("Minimum Coins Required="+count);
}
}
