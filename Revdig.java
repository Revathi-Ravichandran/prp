import java.util.Scanner;
class Revdig
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int rev=0;
int n=s.nextInt();
while(n>0)
{
	rev=rev*10+(n%10);
	n=n/10;
}
System.out.println(rev);
}
}
