import java.util.Scanner;
class Charswap
{
	public static void main(String args[])
	{
		String t=" ";
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		if(s1.length()%2==0)
		{
			
			for(int i=0;i<s1.length();i+=2)
			{
				t=t+s1.charAt(i+1)+s1.charAt(i);
			}
		}
		else
		{
			
		
			for(int i=0;i<s1.length()-1;i+=2)
			{
				t=t+s1.charAt(i+1)+s1.charAt(i);
			}
			t=t+s1.charAt(s1.length()-1);
		}	
System.out.println(t.trim());
	}
}	
