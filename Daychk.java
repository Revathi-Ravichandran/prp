import java.util.Scanner;
class Daychk
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		String day=s.next();
		if(day.equals("sunday"))
		System.out.println("false");
	else
		System.out.println("true");
	}
}	
