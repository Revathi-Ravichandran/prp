import java.util.Scanner;
import java.util.Arrays;
class Maxrep
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		String s1=S.nextLine();
		String s2[]=s1.split(" ");
		int a[]=new int[26];
		int pos=0,t=0,max=0;
		for(int j=0;j<s2[0].length();j++)
			{
				a[((int)s2[0].charAt(j))-97]++;
			}
			Arrays.sort(a);
			max=a[25];
		for(int i=0;i<s2.length;i++)
		{
			for(int j=0;j<s2[i].length();j++)
			{
				a[((int)s2[i].charAt(j))-97]++;
			}
			Arrays.sort(a);
			t=a[25];
			if(t>max)
				pos=i;
		}
			System.out.println(s2[pos]);
	}
}
