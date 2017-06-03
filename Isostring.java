import java.util.Scanner;
class Isostring
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int f=0;
String st=s.next();
String st1=s.next();
//System.out.println(((int)st.charAt(0))-97);
if(st.length()!=st1.length())
{
	f=1;
}
else
{
	int map[]=new int[27];
	int map1[]=new int[27];
	char a=' ',b=' ';
	for(int i=0;i<st.length();i++)
	{
		a=st.charAt(i);
				b=st1.charAt(i);
		if(map[((int)(a))-96]==0)
		{
			if(map1[((int)(b))-96]==0)
			{
				map1[((int)(b))-96]++;
				map[((int)(a))-96]=((int)(b))-96;
			}
			else
			{
				f=1;
				break;
			}
			
		}
		else
		{
			if(map[(int)(a)-96]!=((int)(b))-96)
			{
				f=1;
				break;
			}
		}
	}
	if(f==1)
		System.out.println("false");
	else
		System.out.println("true");
}
}
		
}
