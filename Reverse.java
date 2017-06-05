import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
	Scanner S=new Scanner(System.in);
	StringBuffer sb=new StringBuffer(S.next());
	sb.reverse();
	char ch=' ';
	for(int i=0;i<sb.length();i++)
	{
		ch=sb.charAt(i);
		if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			System.out.print(ch);
	}
}
}
