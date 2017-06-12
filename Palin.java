import java.util.Scanner;
class Palin
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		StringBuffer sb=new StringBuffer(S.next());
		StringBuffer t=new StringBuffer(" ");
		StringBuffer t1=new StringBuffer(" ");
		int max=0;
		StringBuffer res=new StringBuffer(" ");
		StringBuffer temp=new StringBuffer(" ");
		for(int i=0;i<sb.length();i++)
			for(int j=i+1;j<=sb.length();j++)
			{
				t=new StringBuffer(sb.substring(i,j));
				t1=new StringBuffer(sb.substring(i,j));
				t1.reverse();
				/*if((t.toString()).equals(t1.toString()))
					System.out.println(temp+" "+t);*/
				if((t.toString()).equals(t1.toString())&&t.length()>max)
				{
					max=t.length();
					res=t;
					//System.out.println(t+" "+t1);
				}
				
			}
			System.out.println(res);
	}
}
				