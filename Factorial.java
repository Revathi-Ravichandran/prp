class Factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int fact=1;
int n=s.nextInt();
for(int i=2;i<=n;i++)
	fact=fact*i;
System.out.println(fact);
}
}
