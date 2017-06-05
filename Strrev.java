import java.util.Scanner;
class Strrev
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		String s1=S.nextLine();
		String s2=" ";
		String s3[]=s1.split(" ");
		for(int i=s3.length-1;i>=0;i--)
			s2=s2+s3[i]+" ";
		System.out.println(s2.trim());
	}
}
